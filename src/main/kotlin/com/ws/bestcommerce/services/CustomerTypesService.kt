package com.ws.bestcommerce.services

import com.ws.bestcommerce.domain.CustomerTypes
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import java.util.*

@Service
class CustomerTypesService (var db: JdbcTemplate) {
    fun listCustomerTypes(): List<CustomerTypes> = db.query("select * from Customer_Types") { response, _ ->
        CustomerTypes(
            response.getString("id"),
            response.getString("description"),
        )
    }

    fun findCustomerTypeById(id: String): CustomerTypes? = db.query("select * from Customer_Types where id = ?", id) { response, _ ->
        CustomerTypes (
            response.getString("id"),
            response.getString("description"))
    }.firstOrNull()

    fun saveCustomerType(customerTypes: CustomerTypes) {
        val id = customerTypes.id ?: UUID.randomUUID().toString()
        db.update("insert into Customer_Types values ( ?, ?)",
            id, customerTypes.description)
    }

    fun updateCustomerType(customerTypes: CustomerTypes) {
        db.update("update Customer_Types set description = ? where id = ?",
            customerTypes.description, customerTypes.id)
    }

    fun deleteCostumerTypes(id: String) {
        db.update("delete from Customer_Types where id = ?", id)
    }
}