package com.example.groceryapp

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import android.widget.Button
import android.content.Intent


class cartScreen1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cart_screen1)

        val payButton = findViewById<Button>(R.id.checkoutButton)

        payButton.setOnClickListener {

            val intent = Intent(this, checkoutScreen::class.java)

            startActivity(intent)
        }

        val backBtn = findViewById<ImageButton>(R.id.backButton)
        backBtn.setOnClickListener {
            finish()
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = CartAdapter(
            CartManager.cartItems,
            this
        )
        updateTotal()
    }
     fun updateTotal() {
        val productTotalText = findViewById<TextView>(R.id.productTotalText)

        val deliveryText = findViewById<TextView>(R.id.deliveryPriceText)

        val finalTotalText = findViewById<TextView>(R.id.totalPriceText)

        val payButton = findViewById<Button>(R.id.checkoutButton)

        var total = 0

        for (product in CartManager.cartItems) {

            total += product.price * product.quantity
        }

        val delivery = 40

        val finalTotal = total + delivery

        productTotalText.text = "₹$total"

        deliveryText.text = "₹$delivery"

        finalTotalText.text = "₹$finalTotal"

        payButton.text = "Pay - ₹$finalTotal"
    }
}