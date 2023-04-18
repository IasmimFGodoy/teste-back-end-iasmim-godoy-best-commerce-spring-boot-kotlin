package com.ws.bestcommerce.controllers

import com.ws.bestcommerce.domain.Store
import com.ws.bestcommerce.services.StoreService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
class StoreController (val service: StoreService){
    @GetMapping("/stores")
    fun index(): List<Store> = service.listStores()

    @GetMapping("/store/{id}")
    fun index(@PathVariable id: String): Store? = service.findStoreById(id)

    @PostMapping("/store")
    fun post(@RequestBody store: Store) {
        service.saveStore(store)
    }

    @PutMapping("/updatestore/{id}")
    fun update(@PathVariable id: String, @RequestBody store: Store) {
        val existingStore = service.findStoreById(id)
        if (existingStore != null) {
            val updatedStore = store.copy(id = id)
            service.updateStore(updatedStore)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "Store not found with ID $id"
            )
        }
    }

    @DeleteMapping("/deletestore/{id}")
    fun delete(@PathVariable id: String) {
        val existingStore = service.findStoreById(id)
        if (existingStore != null) {
            service.deleteStore(id)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "Store not found with ID $id"
            )
        }
    }
}