package com.example.testshop2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testshop2.databinding.ActivityMainBinding
import com.example.testshop2.presentation.adapter.ProductAdapter
import com.example.testshop2.presentation.viewmodel.ProductViewModel

class MainActivity : AppCompatActivity() {

    private val productViewModel: ProductViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productList = productViewModel.getProductItem()
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = ProductAdapter(productList)
    }
}