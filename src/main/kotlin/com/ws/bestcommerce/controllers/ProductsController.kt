package com.ws.bestcommerce.controllers

import com.ws.bestcommerce.domain.CarouselProducts
import com.ws.bestcommerce.domain.ContainerProductsEndPoint
import com.ws.bestcommerce.domain.Products
import com.ws.bestcommerce.services.ProductsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductsController (val service: ProductsService){
    @GetMapping("/categories/healthyandcare")
    fun listHealthyAndCareProducts(): List<Products> = service.listHealthyAndCareProducts()

    @GetMapping("/categories/food")
    fun listFoodProducts(): List<Products> = service.listFoodProducts()

    @GetMapping("/categories/pet")
    fun listPetProducts(): List<Products> = service.listPetProducts()

    @GetMapping("/categories/hardware")
    fun listHardwareProducts(): List<Products> = service.listHardwareProducts()

    @GetMapping("/categories/flowers")
    fun listFlowersProducts(): List<Products> = service.listFlowersProducts()

    @GetMapping("/categories/gardens")
    fun listGardensProducts(): List<Products> = service.listGardensProducts()

    @GetMapping("/categories/beautyandhair")
    fun listBeautyAndHairProducts(): List<Products> = service.listBeautyAndHairProducts()

    @GetMapping("/myproducts")
    fun listContainerImgProducts(): List<ContainerProductsEndPoint> = service.listContainerImgProducts()

    @GetMapping("/myproducts/carousel")
    fun listCarouselProducts(): List<CarouselProducts> = service.listCarouselProducts()


}