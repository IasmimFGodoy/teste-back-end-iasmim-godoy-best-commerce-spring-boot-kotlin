package com.ws.bestcommerce.controllers


import com.ws.bestcommerce.domain.CustomerStores
import com.ws.bestcommerce.services.CustomerStoresService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
class CustomerStoresController (val service: CustomerStoresService) {
    @GetMapping("/customerstores")
    fun index(): List<CustomerStores> = service.listCostumerStores()

    @GetMapping("/customerstore/{id}")
    fun index(@PathVariable id: String): CustomerStores? = service.findCustomerStoreById(id)

    @PostMapping("/customerstore")
    fun post(@RequestBody customerStores: CustomerStores) {
        service.saveCustomerStore(customerStores)
    }

    @PutMapping("/updatecustomerstore/{id}")
    fun update(@PathVariable id: String, @RequestBody customerStores: CustomerStores) {
        val existingCustomerStore = service.findCustomerStoreById(id)
        if (existingCustomerStore != null) {
            val updatedCustomerStore = customerStores.copy(id = id)
            service.updateCustomerStore(updatedCustomerStore)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "Customer Store not found with ID $id"
            )
        }
    }

    @DeleteMapping("/deletecustomerstores/{id}")
    fun delete(@PathVariable id: String) {
        val existingCustomerStore = service.findCustomerStoreById(id)
        if (existingCustomerStore != null) {
            service.deleteCustomerStore(id)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "User not found with ID $id"
            )
        }
    }
}