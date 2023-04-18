package com.ws.bestcommerce.services

import com.ws.bestcommerce.domain.Sales
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import java.util.*

@Service
class SalesService (val db: JdbcTemplate){
    fun listSales(): List<Sales> = db.query("select * from Sales") { response, _ ->
        Sales(
            response.getString("id"),
            response.getString("costumerId"),
            response.getDouble("price"),
            response.getDouble("tax"),
            response.getDate("saleDate")
        )
    }

    fun findSaleById(id: String): Sales? = db.query("select * from Sales where id = ?", id) { response, _ ->
        Sales (
            response.getString("id"),
            response.getString("costumerId"),
            response.getDouble("price"),
            response.getDouble("tax"),
            response.getDate("saleDate"))
    }.firstOrNull()

    fun saveSale(sales: Sales) {
        val id = sales.id ?: UUID.randomUUID().toString()
        db.update("insert into Sales values ( ?, ?, ?, ?, ? )",
            id, sales.costumerId, sales.price, sales.tax, sales.saleDate)
    }

    fun updateSale(sales: Sales) {
        db.update("update Sales set costumerId = ?, price = ?, tax = ?, saleDate = ? where id = ?",
            sales.costumerId, sales.price, sales.tax, sales.saleDate, sales.id)
    }

    fun deleteSale(id: String) {
        db.update("delete from Sales where id = ?", id)
    }
}