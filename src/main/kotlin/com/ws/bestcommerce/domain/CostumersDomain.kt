package com.ws.bestcommerce.domain


import org.springframework.data.relational.core.mapping.Table

class CostumersDomain {
}
@Table("COSTUMERS")
data class Costumers (
    var id: String?,
    val name: String,
    val age: Int,
    val costumerType: String
)