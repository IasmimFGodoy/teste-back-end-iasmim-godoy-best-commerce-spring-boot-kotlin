package com.ws.bestcommerce.services

import com.ws.bestcommerce.domain.CarouselProducts
import com.ws.bestcommerce.domain.ContainerProductsEndPoint
import com.ws.bestcommerce.domain.ContainerProductsEndPointDomain
import com.ws.bestcommerce.domain.Products
import org.springframework.stereotype.Service

@Service
class ProductsService {
    fun listHealthyAndCareProducts(): List<Products> {
        val products = mutableListOf<Products>()
        products.add(Products("1","Seed and nut mix","Healthy & Care"))
        products.add(Products("2","Natural granola bar","Healthy & Care"))
        products.add(Products("3","Unsweetened granola","Healthy & Care"))
        products.add(Products("4","Fat-free Greek yogurt","Healthy & Care"))
        products.add(Products("5","Dried fruit","Healthy & Care"))
        products.add(Products("6","Baked vegetable chips","Healthy & Care"))
        products.add(Products("7","Natural fruit smoothie","Healthy & Care"))
        products.add(Products("8","Natural peanut butter","Healthy & Care"))
        products.add(Products("9","Natural coconut water","Healthy & Care"))
        products.add(Products("10","Organic green tea","Healthy & Care"))
        return products
    }

    fun listFoodProducts(): List<Products> {
        val products = mutableListOf<Products>()
        products.add(Products("01","Avocado", "Food"))
        products.add(Products("02","Quinoa", "Food"))
        products.add(Products("03","Greek yogurt", "Food"))
        products.add(Products("04","Almond butter", "Food"))
        products.add(Products("05","Brown rice", "Food"))
        products.add(Products("06","Sweet potato", "Food"))
        products.add(Products("07","Kale", "Food"))
        products.add(Products("08","Salmon", "Food"))
        products.add(Products("09","Chia seeds", "Food"))
        products.add(Products("10","Blueberries", "Food"))
        return products
    }

    fun listPetProducts(): List<Products> {
        val products = mutableListOf<Products>()
        products.add(Products("01","Dog food", "Pet"))
        products.add(Products("02","Cat litter", "Pet"))
        products.add(Products("03","Chew toys", "Pet"))
        products.add(Products("04","Bird seed", "Pet"))
        products.add(Products("05","Fish food", "Pet"))
        products.add(Products("06","Hamster bedding", "Pet"))
        products.add(Products("07","Reptile heat lamps", "Pet"))
        products.add(Products("08","Rabbit food", "Pet"))
        products.add(Products("09","Guinea pig hay", "Pet"))
        products.add(Products("10","Catnip toys", "Pet"))
        return products
    }

    fun listHardwareProducts(): List<Products> {
        val products = mutableListOf<Products>()
        products.add(Products("01","Processor", "Hardware"))
        products.add(Products("02","Graphics card", "Hardware"))
        products.add(Products("03","Solid state drive (SSD)", "Hardware"))
        products.add(Products("04","Power supply unit (PSU)", "Hardware"))
        products.add(Products("05","Motherboard", "Hardware"))
        products.add(Products("06","RAM (Random Access Memory)", "Hardware"))
        products.add(Products("07","Cooling system (CPU cooler or fans)", "Hardware"))
        products.add(Products("08","Case", "Hardware"))
        products.add(Products("09","Hard disk drive (HDD)", "Hardware"))
        products.add(Products("10","Peripheral devices (keyboard, mouse, etc.)", "Hardware"))
        return products
    }

    fun listFlowersProducts(): List<Products> {
        val products = mutableListOf<Products>()
        products.add(Products("01","Rose", "Flowers"))
        products.add(Products("02","Lily", "Flowers"))
        products.add(Products("03","Sunflower", "Flowers"))
        products.add(Products("04","Tulip", "Flowers"))
        products.add(Products("05","Orchid", "Flowers"))
        products.add(Products("06","Daffodil", "Flowers"))
        products.add(Products("07","Daisy", "Flowers"))
        products.add(Products("08","Carnation", "Flowers"))
        products.add(Products("09","Peony", "Flowers"))
        products.add(Products("10","Chrysanthemum", "Flowers"))
        return products
    }
    fun listGardensProducts(): List<Products> {
        val products = mutableListOf<Products>()
        products.add(Products("01", "Soil", "Garden's"))
        products.add(Products("02", "Compost", "Garden's"))
        products.add(Products("03", "Fertilizer", "Garden's"))
        products.add(Products("04", "Garden hose", "Garden's"))
        products.add(Products("05", "Garden gloves", "Garden's"))
        products.add(Products("06", "Pruning shears", "Garden's"))
        products.add(Products("07", "Garden trowel", "Garden's"))
        products.add(Products("08", "Lawn mower", "Garden's"))
        products.add(Products("09", "Watering can", "Garden's"))
        products.add(Products("10", "Garden stakes", "Garden's"))
        return products
    }

    fun listBeautyAndHairProducts(): List<Products> {
        val products = mutableListOf<Products>()
        products.add(Products("01", "Shampoo", "Beauty & Hair"))
        products.add(Products("02", "Conditioner", "Beauty & Hair"))
        products.add(Products("03", "Hair serum", "Beauty & Hair"))
        products.add(Products("04", "Hair mask", "Beauty & Hair"))
        products.add(Products("05", "Facial cleanser", "Beauty & Hair"))
        products.add(Products("06", "Moisturizer", "Beauty & Hair"))
        products.add(Products("07", "Lip balm", "Beauty & Hair"))
        products.add(Products("08", "Eye cream", "Beauty & Hair"))
        products.add(Products("09", "Face mask", "Beauty & Hair"))
        products.add(Products("10", "Body lotion", "Beauty & Hair"))
        return products
    }

    fun listCarouselProducts(): List<CarouselProducts> {
        val products = mutableListOf<CarouselProducts>()
        products.add(CarouselProducts("1","carousel-product-1","D:\\teste-front-end-iasmim-godoy-ws-work-questao-1\\static\\Carousel-img1.jpg",1.99))
        products.add(CarouselProducts("2","carousel-product-2","D:\\teste-front-end-iasmim-godoy-ws-work-questao-1\\static\\Carousel-img2.jpg",1.99))
        products.add(CarouselProducts("3","carousel-product-3","D:\\teste-front-end-iasmim-godoy-ws-work-questao-1\\static\\Carousel-img3.jpg",1.99))
        products.add(CarouselProducts("4","carousel-product-3","D:\\teste-front-end-iasmim-godoy-ws-work-questao-1\\static\\Carousel-img4.jpg",1.99))
        return products
    }

    fun listContainerImgProducts(): List<ContainerProductsEndPoint> {
        val products = mutableListOf<ContainerProductsEndPoint>()
        products.add(ContainerProductsEndPoint("1","super-supplement","D:\\teste-front-end-iasmim-godoy-ws-work-questao-1\\static\\Product1.jpg",9.99))
        products.add(ContainerProductsEndPoint("2","apple","D:\\teste-front-end-iasmim-godoy-ws-work-questao-1\\static\\img-apple.jpg",0.22))
        products.add(ContainerProductsEndPoint("3","water","D:\\teste-front-end-iasmim-godoy-ws-work-questao-1\\static\\img-water.jpg", null))
        return products
    }
}