package com.ws.bestcommerce.services

import com.ws.bestcommerce.domain.Store
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import java.util.*

@Service
class StoreService (val db: JdbcTemplate){
    fun listStores(): List<Store> = db.query("select * from Store") { response, _ ->
        Store(
            response.getString("id"),
            response.getString("name"),
            response.getString("address"),
            response.getInt("number"),
            response.getString("neighbor"),
            response.getString("state"),
            response.getString("city"),
            response.getString("country"),
        )
    }

    fun findStoreById(id: String): Store? = db.query("select * from Store where id = ?", id) { response, _ ->
        Store (
            response.getString("id"),
            response.getString("name"),
            response.getString("address"),
            response.getInt("number"),
            response.getString("neighbor"),
            response.getString("state"),
            response.getString("city"),
            response.getString("country"))
    }.firstOrNull()

    fun saveStore(store: Store) {
        val id = store.id ?: UUID.randomUUID().toString()
        db.update("INSERT INTO Store VALUES (?,?,?,?,?,?,?,?)",
            id, store.name, store.address, store.number, store.neighbor,
            store.state, store.city, store.country)
    }

    fun updateStore(store: Store) {
        db.update("UPDATE Store SET name = ?, address = ?, number = ?, neighbor = ?, state = ?, city = ?, country = ? WHERE id = ?",
            store.name, store.address, store.number, store.neighbor, store.state, store.city, store.country, store.id)
    }

    fun deleteStore(id: String) {
        db.update("delete from Store where id = ?", id)
    }
}