package com.ws.bestcommerce.domain

import org.springframework.data.relational.core.mapping.Table

class CustomerTypesDomain {
}

@Table("CUSTOMER_TYPES")
data class CustomerTypes (
    var id: String?,
    val description: String,
)