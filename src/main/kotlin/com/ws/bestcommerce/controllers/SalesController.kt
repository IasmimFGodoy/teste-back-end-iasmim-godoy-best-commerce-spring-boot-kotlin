package com.ws.bestcommerce.controllers

import com.ws.bestcommerce.domain.Sales
import com.ws.bestcommerce.services.SalesService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
class SalesController(val service: SalesService) {
    @GetMapping("/sales")
    fun index(): List<Sales> = service.listSales()

    @GetMapping("/sale/{id}")
    fun index(@PathVariable id: String): Sales? = service.findSaleById(id)

    @PostMapping("/sale")
    fun post(@RequestBody sale: Sales) {
        service.saveSale(sale)
    }

    @PutMapping("/updatesale/{id}")
    fun update(@PathVariable id: String, @RequestBody sale: Sales) {
        val existingSale = service.findSaleById(id)
        if (existingSale != null) {
            val updatedSale = sale.copy(id = id)
            service.updateSale(updatedSale)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "Sale not found with ID $id"
            )
        }
    }

    @DeleteMapping("/deletesale/{id}")
    fun delete(@PathVariable id: String) {
        val existingSale = service.findSaleById(id)
        if (existingSale != null) {
            service.deleteSale(id)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "Sale not found with ID $id"
            )
        }
    }
}