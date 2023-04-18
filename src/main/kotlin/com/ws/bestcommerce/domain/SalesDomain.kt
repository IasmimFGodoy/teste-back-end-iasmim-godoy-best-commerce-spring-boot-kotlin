package com.ws.bestcommerce.domain

import org.springframework.data.relational.core.mapping.Table
import java.util.Date

class SalesDomain {
}

@Table("SALES")
data class Sales (
    var id: String?,
    val costumerId: String,
    val price: Double,
    val tax: Double,
    val saleDate: Date
)