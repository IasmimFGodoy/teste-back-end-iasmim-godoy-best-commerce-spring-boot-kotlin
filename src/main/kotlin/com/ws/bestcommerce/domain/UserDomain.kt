package com.ws.bestcommerce.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


class UserDomain {
}

@Table("USERS")
data class Users (
    var id: String?,
    val username: String,
    val password: String
)