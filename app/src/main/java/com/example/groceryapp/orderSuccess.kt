package com.example.groceryapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class orderSuccess : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_order_success)

        val productsText =
            findViewById<TextView>(R.id.productsText)

        val totalAmountText =
            findViewById<TextView>(R.id.totalAmountText)

        val homeButton =
            findViewById<Button>(R.id.homeButton)

        // PRODUCTS

        val productNames =
            CartManager.orderedItems.joinToString(", ") {

                it.name
            }

        productsText.text = productNames

        // TOTAL

        var total = 0

        for (product in CartManager.orderedItems) {

            total += product.price * product.quantity
        }

        totalAmountText.text = "₹$total"

        // CLEAR CART

        CartManager.cartItems.clear()

        // HOME BUTTON

        homeButton.setOnClickListener {

            val intent =
                Intent(this, homePage::class.java)

            startActivity(intent)

            finish()
        }
    }
}