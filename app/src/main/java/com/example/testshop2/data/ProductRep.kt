package com.example.testshop2.data

import com.example.testshop2.domain.models.ProductItem

class ProductRep {
    fun getProductsItem(): List<ProductItem> {
        return listOf(
            ProductItem(
                1,
                "Product 1",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpO90YTnjj1_1IB_qw-0E48wkIEdQZbM5Aaw&usqp=CAU",
                19.99
            ),
            ProductItem(
                2,
                "Product 2",
                "https://i.pinimg.com/originals/40/63/54/4063542411040f662afef02456b7fcf2.png",
                29.99
            ),
            // Add more products as needed
        )
    }
}