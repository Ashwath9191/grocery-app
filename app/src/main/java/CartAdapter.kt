package com.example.groceryapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CartAdapter(
    private val items: MutableList<Product>,
    private val cartContext: Context
) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    class CartViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val productName = view.findViewById<TextView>(R.id.productName)

        val quantityText = view.findViewById<TextView>(R.id.quantityText)

        val productPrice = view.findViewById<TextView>(R.id.productPrice)

        val plusButton = view.findViewById<Button>(R.id.plusButton)

        val minusButton = view.findViewById<Button>(R.id.minusButton)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CartViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cart, parent, false)

        return CartViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CartViewHolder,
        position: Int
    ) {

        val product = items[position]

        holder.productName.text = product.name

        holder.quantityText.text = product.quantity.toString()

        holder.productPrice.text =
            "₹" + (product.price * product.quantity)

        // PLUS BUTTON

        holder.plusButton.setOnClickListener {

            product.quantity++

            notifyItemChanged(position)

            (cartContext as cartScreen1).updateTotal()
        }

        // MINUS BUTTON

        holder.minusButton.setOnClickListener {

            if (product.quantity > 1) {

                product.quantity--

                notifyItemChanged(position)

            } else {

                items.removeAt(position)

                notifyItemRemoved(position)
            }

            (cartContext as cartScreen1).updateTotal()
        }
    }

    override fun getItemCount(): Int {

        return items.size
    }
}