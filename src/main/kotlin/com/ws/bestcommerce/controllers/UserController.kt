package com.ws.bestcommerce.controllers

import com.ws.bestcommerce.domain.Users
import com.ws.bestcommerce.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
class UserController(val service: UserService) {
    @GetMapping("/users")
    fun index(): List<Users> = service.listUsers()

    @GetMapping("/user/{id}")
    fun index(@PathVariable id: String): Users? = service.findUserById(id)

    @PostMapping("/user")
    fun post(@RequestBody users: Users) {
        service.saveUser(users)
    }

    @PutMapping("/updateuser/{id}")
    fun update(@PathVariable id: String, @RequestBody user: Users) {
        val existingUser = service.findUserById(id)
        if (existingUser != null) {
            val updatedUser = user.copy(id = id)
            service.updateUser(updatedUser)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "User not found with ID $id"
            )
        }
    }

    @DeleteMapping("/deleteuser/{id}")
    fun delete(@PathVariable id: String) {
        val existingUser = service.findUserById(id)
        if (existingUser != null) {
            service.deleteUser(id)
        } else {
            throw ResponseStatusException (
                HttpStatus.NOT_FOUND, "User not found with ID $id"
            )
        }
    }
}