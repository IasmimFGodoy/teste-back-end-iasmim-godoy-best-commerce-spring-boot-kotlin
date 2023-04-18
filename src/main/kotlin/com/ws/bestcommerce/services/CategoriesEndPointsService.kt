package com.ws.bestcommerce.services

import com.ws.bestcommerce.domain.CategoriesEndPoints
import org.springframework.stereotype.Service

@Service
class CategoriesEndPointsService {
    fun listCategories(): List<CategoriesEndPoints>{
        val categories = mutableListOf<CategoriesEndPoints>()
        categories.add(CategoriesEndPoints("1", "Healthy & Care"))
        categories.add(CategoriesEndPoints("2", "Food"))
        categories.add(CategoriesEndPoints("3", "Pet"))
        categories.add(CategoriesEndPoints("4", "Hardware"))
        categories.add(CategoriesEndPoints("5", "Flowers"))
        categories.add(CategoriesEndPoints("6", "Garden's"))
        categories.add(CategoriesEndPoints("7", "Beauty & Hair"))
        return categories
    }
}