package com.example.groceryapp

object CartManager {



    val cartItems = mutableListOf<Product>()

    fun addItem(product: Product) {

        val existingItem = cartItems.find {

            it.name == product.name
        }

        if (existingItem != null) {

            existingItem.quantity++

        } else {

            cartItems.add(product)
        }
    }

    var orderedItems = mutableListOf<Product>()
}