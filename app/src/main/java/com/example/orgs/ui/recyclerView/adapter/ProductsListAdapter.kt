package com.example.orgs.ui.recyclerView.adapter

import android.view.*
import android.widget.TextView
import androidx.recyclerview.widget.*
import com.example.orgs.*
import com.example.orgs.data.model.*

class ProductsListAdapter(
    private val productsList: List<Product>
) : RecyclerView.Adapter<ProductsListAdapter.ProductViewHolder>() {
    class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(product: Product) {
            itemView.findViewById<TextView>(R.id.product_name).text = product.name
            itemView.findViewById<TextView>(R.id.product_description).text = product.description
            itemView.findViewById<TextView>(R.id.product_value).text = String.format(product.value.toString())
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.view_holder_product, parent, false
        )
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ProductViewHolder,
        position: Int
    ) {
        holder.bind(productsList[position])
    }

    override fun getItemCount(): Int = productsList.size
}
