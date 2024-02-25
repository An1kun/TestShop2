package com.example.testshop2.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.testshop2.data.ProductRep
import com.example.testshop2.domain.models.ProductItem

class ProductViewModel:ViewModel() {
    private val productRep = ProductRep()

    fun getProductItem():List<ProductItem>{
        return productRep.getProductsItem()
    }
}