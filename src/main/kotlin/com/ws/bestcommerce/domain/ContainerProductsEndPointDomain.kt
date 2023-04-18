package com.ws.bestcommerce.domain

class ContainerProductsEndPointDomain {
}

data class ContainerProductsEndPoint (
    var id: String?,
    val imgName: String,
    val imgPath: String,
    val price: Double?
)