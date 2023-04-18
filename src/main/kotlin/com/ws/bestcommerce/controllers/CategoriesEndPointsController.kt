package com.ws.bestcommerce.controllers

import com.ws.bestcommerce.domain.CategoriesEndPoints
import com.ws.bestcommerce.services.CategoriesEndPointsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CategoriesEndPointsController ( val service: CategoriesEndPointsService){
    @GetMapping("/categories")
    fun index(): List<CategoriesEndPoints> = service.listCategories()

}