package com.ws.bestcommerce.services


import com.ws.bestcommerce.domain.CustomerStores
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import java.time.Instant
import java.util.*

@Service
class CustomerStoresService(val db: JdbcTemplate) {
    fun listCostumerStores(): List<CustomerStores> = db.query("select * from Customer_Stores") { response, _ ->
        CustomerStores(
            response.getString("id"),
            response.getString("costumerId"),
            response.getString("idStore"),
            response.getDate("changeDate")
        )
    }

    fun findCustomerStoreById(id: String): CustomerStores? = db.query("select * from Customer_Stores where id = ?", id) { response, _ ->
        CustomerStores (
            response.getString("id"),
            response.getString("costumerId"),
            response.getString("idStore"),
            response.getDate("changeDate"))
    }.firstOrNull()

    fun saveCustomerStore(costumerStores: CustomerStores) {
        val id = costumerStores.id ?: UUID.randomUUID().toString()
        val costumerId = db.queryForObject("SELECT id FROM Costumers WHERE id = ?", String::class.java, costumerStores.costumerId)
        val idStore = db.queryForObject("SELECT id FROM Store WHERE id = ?", String::class.java, costumerStores.idStore)
        db.update("INSERT INTO Customer_Stores VALUES (?, ?, ?, ?)",
            id, costumerId, idStore, Instant.now())
    }

    fun updateCustomerStore(customerStores: CustomerStores) {
        val customerId = db.queryForObject("SELECT id FROM Costumers WHERE id = ?", String::class.java, customerStores.costumerId)
        val idStore = db.queryForObject("SELECT id FROM Store WHERE id = ?", String::class.java, customerStores.idStore)
        db.update("UPDATE Customer_Stores SET costumerId = ?, idStore = ?, ChangeDate = ? WHERE id = ?",
            customerId, idStore, Instant.now(), customerStores.id)
    }

    fun deleteCustomerStore(id: String) {
        db.update("delete from Customer_Stores where id = ?", id)
    }
}

