package com.ws.bestcommerce.services

import com.ws.bestcommerce.domain.Costumers
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import java.util.*

@Service
class CostumersService (val db: JdbcTemplate){
    fun listCostumers(): List<Costumers> = db.query("select * from Costumers") { response, _ ->
        Costumers(
            response.getString("id"),
            response.getString("name"),
            response.getInt("age"),
            response.getString("costumerType")
        )
    }

    fun findCostumerById(id: String): Costumers? = db.query("select * from Costumers where id = ?", id) { response, _ ->
        Costumers (
            response.getString("id"),
            response.getString("name"),
            response.getInt("age"),
            response.getString("costumerType"))
    }.firstOrNull()

    fun saveCostumer(costumers: Costumers) {
        val id = costumers.id ?: UUID.randomUUID().toString()
        val typeId = db.queryForObject("SELECT id FROM Customer_Types WHERE id = ?", String::class.java, costumers.costumerType)
        db.update("INSERT INTO Costumers VALUES (?, ?, ?, ?)", id, costumers.name, costumers.age, typeId)
    }

    fun updateCostumer(costumers: Costumers) {
        val typeId = db.queryForObject("SELECT id FROM Customer_Types WHERE id = ?", String::class.java, costumers.costumerType)
        db.update("UPDATE Costumers SET name = ?, age = ?, costumerType = ? WHERE id = ?", costumers.name, costumers.age, typeId, costumers.id)
    }

    fun deleteCostumer(id: String) {
        db.update("delete from Costumers where id = ?", id)
    }
}