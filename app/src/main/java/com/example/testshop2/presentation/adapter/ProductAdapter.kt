package com.example.testshop2.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testshop2.databinding.ItemProductBinding
import com.example.testshop2.domain.models.ProductItem

class ProductAdapter(private val productList: List<ProductItem>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder(private val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(product: ProductItem) {
            binding.tvProductName.text = product.name
            binding.tvProductPrice.text = "$${product.price}"
            Glide.with(itemView)
                .load((product.imageUrl)) // Replace with your actual method to get the image URL
                .centerCrop()
                .into(binding.ivProductImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(productList[position])
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}