package com.ws.bestcommerce.services

import com.ws.bestcommerce.domain.Users
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService (val db: JdbcTemplate){
    fun listUsers(): List<Users> = db.query("select * from Users") { response, _ ->
        Users(
            response.getString("id"),
            response.getString("username"),
            response.getString("password")
        )
    }

    fun findUserById(id: String): Users? = db.query("select * from Users where id = ?", id) { response, _ ->
        Users (
            response.getString("id"),
            response.getString("username"),
            response.getString("password"))
    }.firstOrNull()


    fun saveUser(users: Users) {
        val id = users.id ?: UUID.randomUUID().toString()
        db.update("insert into Users values ( ?, ?, ? )",
            id, users.username, users.password)
    }

    fun updateUser(user: Users) {
        db.update("update Users set username = ?, password = ? where id = ?",
            user.username, user.password, user.id)
    }

    fun deleteUser(id: String) {
        db.update("delete from Users where id = ?", id)
    }

}