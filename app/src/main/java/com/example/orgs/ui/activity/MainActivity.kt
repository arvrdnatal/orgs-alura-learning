package com.example.orgs.ui.activity

import android.app.Activity
import android.os.*
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.*
import com.example.orgs.data.model.*
import com.example.orgs.ui.recyclerView.adapter.*
import java.math.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productsList = mutableListOf<Product>()
        for (i in 1..4) productsList.add(
            Product(
                name = "teste $i",
                description = "descrição $i",
                value = BigDecimal("10")
            )
        )

        val productsListRecyclerView = findViewById<RecyclerView>(R.id.products_list)
        productsListRecyclerView.adapter = ProductsListAdapter(productsList)
    }
}