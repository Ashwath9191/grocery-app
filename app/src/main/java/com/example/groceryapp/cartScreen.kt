package com.example.groceryapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class cartScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Connect Kotlin with XML
        setContentView(R.layout.activity_cart_screen)
    }
}