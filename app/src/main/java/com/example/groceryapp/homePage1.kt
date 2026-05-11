package com.example.groceryapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.LinearLayout
class homePage1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_page1)

        val searchEditText = findViewById<EditText>(R.id.searchEditText)

        val mangoCard = findViewById<LinearLayout>(R.id.mangoCard)
        val appleCard = findViewById<LinearLayout>(R.id.appleCard)
        val bananaCard = findViewById<LinearLayout>(R.id.bananaCard)
        val orangeCard = findViewById<LinearLayout>(R.id.orangeCard)
        val potatoCard = findViewById<LinearLayout>(R.id.potatoCard)
        val watermelonCard = findViewById<LinearLayout>(R.id.watermelonCard)
        val carrotCard = findViewById<LinearLayout>(R.id.carrotCard)
        val lemonCard = findViewById<LinearLayout>(R.id.lemonCard)
        val spinachCard = findViewById<LinearLayout>(R.id.spinachCard)
        val onionCard = findViewById<LinearLayout>(R.id.onionCard)

        searchEditText.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val text = s.toString().lowercase()

                val allCards = listOf(
                    mangoCard, appleCard, bananaCard, orangeCard,
                    potatoCard, watermelonCard, carrotCard,
                    lemonCard, spinachCard, onionCard
                )

                // Hide all first
                for (card in allCards) {
                    card.visibility = View.GONE
                }

                when {
                    text.contains("mango") -> mangoCard.visibility = View.VISIBLE
                    text.contains("apple") -> appleCard.visibility = View.VISIBLE
                    text.contains("banana") -> bananaCard.visibility = View.VISIBLE
                    text.contains("orange") -> orangeCard.visibility = View.VISIBLE
                    text.contains("potato") -> potatoCard.visibility = View.VISIBLE
                    text.contains("watermelon") -> watermelonCard.visibility = View.VISIBLE
                    text.contains("carrot") -> carrotCard.visibility = View.VISIBLE
                    text.contains("lemon") -> lemonCard.visibility = View.VISIBLE
                    text.contains("spinach") -> spinachCard.visibility = View.VISIBLE
                    text.contains("onion") -> onionCard.visibility = View.VISIBLE

                    text.isEmpty() -> {
                        for (card in allCards) {
                            card.visibility = View.VISIBLE
                        }
                    }
                }
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        // ---------------- BACK BUTTON ----------------
        val backButton = findViewById<ImageButton>(R.id.backButton)

        backButton.setOnClickListener {

            // Go to Home Page
            val intent = Intent(this, homePage::class.java)
            startActivity(intent)
        }



        // ---------------- ADD BUTTON 1 ----------------
        val cartButton1 = findViewById<Button>(R.id.cartButton1)

        cartButton1.setOnClickListener {

            CartManager.addItem(
                Product("Mango",150,1, )
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)

            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left)


        }

        // ---------------- ADD BUTTON 2 ----------------
        val cartButton2 = findViewById<Button>(R.id.cartButton2)

        cartButton2.setOnClickListener {

            CartManager.addItem(Product("Apple",120,1,))

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- ADD BUTTON 3 ----------------
        val cartButton3 = findViewById<Button>(R.id.cartButton3)

        cartButton3.setOnClickListener {

            CartManager.addItem(Product("Banana",75,1))

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- ADD BUTTON 4 ----------------
        val cartButton4 = findViewById<Button>(R.id.cartButton4)

        cartButton4.setOnClickListener {
            CartManager.addItem(Product("orange",100,1))

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }


        // ---------------- BUTTON 5 ----------------
        val cartButton5 = findViewById<Button>(R.id.cartButton5)

        cartButton5.setOnClickListener {

            CartManager.addItem(Product("potato",40,1))

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 6 ----------------
        val cartButton6 = findViewById<Button>(R.id.cartButton6)

        cartButton6.setOnClickListener {

            CartManager.addItem(Product("Watermelon",60,1))

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 7 ----------------
        val cartButton7 = findViewById<Button>(R.id.cartButton7)

        cartButton7.setOnClickListener {

            CartManager.addItem(Product("Carrot",50,1))

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 8 ----------------
        val cartButton8 = findViewById<Button>(R.id.cartButton8)

        cartButton8.setOnClickListener {

            CartManager.addItem(Product("Lemons",40,10))

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 9 ----------------
        val cartButton9 = findViewById<Button>(R.id.cartButton9)

        cartButton9.setOnClickListener {

            CartManager.addItem(Product("Spinach",10,1))

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 10 ----------------
        val cartButton10 = findViewById<Button>(R.id.cartButton10)

        cartButton10.setOnClickListener {

            CartManager.addItem(Product("Onions",20,1))

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }
    }
}