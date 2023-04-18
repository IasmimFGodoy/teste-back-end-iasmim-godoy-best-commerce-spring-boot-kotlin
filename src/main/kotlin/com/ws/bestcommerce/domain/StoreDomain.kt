package com.ws.bestcommerce.domain

import org.springframework.data.relational.core.mapping.Table

class StoreDomain {
}
@Table("STORE")
data class Store (
    var id: String?,
    val name: String,
    val address: String,
    val number: Int,
    val neighbor: String,
    val state: String,
    val city: String,
    val country: String,
)