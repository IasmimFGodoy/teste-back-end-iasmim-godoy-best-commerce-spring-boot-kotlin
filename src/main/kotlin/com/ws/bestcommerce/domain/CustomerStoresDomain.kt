package com.ws.bestcommerce.domain

import org.springframework.data.relational.core.mapping.Table
import java.util.Date

class CustomerStoresDomain {
}

@Table("CUSTOMER_STORES")
data class CustomerStores (
    var id: String?,
    val costumerId: String,
    val idStore: String,
    val changeDate: Date?
)