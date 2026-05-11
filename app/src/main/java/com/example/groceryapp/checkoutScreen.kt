package com.example.groceryapp

import android.widget.Button
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class checkoutScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_checkout_screen)

        // Back Button

        val backButton =
            findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {

            val intent =
                Intent(this, homePage::class.java)

            startActivity(intent)

            finish()
        }
        val placeOrderButton =
            findViewById<Button>(R.id.placeOrderButton)

        placeOrderButton.setOnClickListener {

            val intent =
                Intent(this, orderSuccess::class.java)

            CartManager.orderedItems =
                CartManager.cartItems.toMutableList()

            startActivity(intent)

            finish()
        }

    }


}