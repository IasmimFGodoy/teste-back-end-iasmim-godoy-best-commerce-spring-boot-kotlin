package com.ws.bestcommerce.controllers

import com.ws.bestcommerce.domain.CustomerTypes
import com.ws.bestcommerce.services.CustomerTypesService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
class CustomerTypesController (val service: CustomerTypesService){
    @GetMapping("/customertypes")
    fun index(): List<CustomerTypes> = service.listCustomerTypes()

    @GetMapping("/customertype/{id}")
    fun index(@PathVariable id: String): CustomerTypes? = service.findCustomerTypeById(id)

    @PostMapping("/customertype")
    fun post(@RequestBody customerTypes: CustomerTypes) {
        service.saveCustomerType(customerTypes)
    }

    @PutMapping("/updatecustomertype/{id}")
    fun update(@PathVariable id: String, @RequestBody customerTypes: CustomerTypes) {
        val existingCustomerType = service.findCustomerTypeById(id)
        if (existingCustomerType != null) {
            val updatedCustomerType = customerTypes.copy(id = id)
            service.updateCustomerType(updatedCustomerType)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "Customer Type not found with ID $id"
            )
        }
    }

    @DeleteMapping("/deletecustomertype/{id}")
    fun delete(@PathVariable id: String) {
        val existingCustomerType = service.findCustomerTypeById(id)
        if (existingCustomerType != null) {
            service.deleteCostumerTypes(id)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "Customer Type not found with ID $id"
            )
        }
    }
}