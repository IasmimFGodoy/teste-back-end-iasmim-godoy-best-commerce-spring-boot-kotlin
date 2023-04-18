package com.ws.bestcommerce.controllers

import com.ws.bestcommerce.domain.Costumers
import com.ws.bestcommerce.services.CostumersService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
class CostumersController (val service: CostumersService){
    @GetMapping("/costumers")
    fun index(): List<Costumers> = service.listCostumers()

    @GetMapping("/costumer/{id}")
    fun index(@PathVariable id: String): Costumers? = service.findCostumerById(id)

    @PostMapping("/costumer")
    fun post(@RequestBody costumers: Costumers) {
        service.saveCostumer(costumers)
    }

    @PutMapping("/updatecostumer/{id}")
    fun update(@PathVariable id: String, @RequestBody costumer: Costumers) {
        val existingCostumer = service.findCostumerById(id)
        if (existingCostumer != null) {
            val updatedCostumer = costumer.copy(id = id)
            service.updateCostumer(updatedCostumer)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "Customer not found with ID $id"
            )
        }
    }

    @DeleteMapping("/deletecostumer/{id}")
    fun delete(@PathVariable id: String) {
        val existingcostumer = service.findCostumerById(id)
        if (existingcostumer != null) {
            service.deleteCostumer(id)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "Customer not found with ID $id"
            )
        }
    }
}