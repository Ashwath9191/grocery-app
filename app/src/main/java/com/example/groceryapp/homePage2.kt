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
class homePage2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_page2)

        val searchEditText = findViewById<EditText>(R.id.searchEditText)

        val redgramCard = findViewById<LinearLayout>(R.id.redgramCard)
        val moongdalCard = findViewById<LinearLayout>(R.id.moongdalCard)
        val uraddalCard = findViewById<LinearLayout>(R.id.uraddalCard)
        val chanadalCard = findViewById<LinearLayout>(R.id.chanadalCard)
        val groundnutCard = findViewById<LinearLayout>(R.id.groundnutCard)
        val masoordalCard = findViewById<LinearLayout>(R.id.masoordalCard)
        val greenpeasCard = findViewById<LinearLayout>(R.id.greenpeasCard)
        val chickpeasCard = findViewById<LinearLayout>(R.id.chickpeasCard)
        val rajmaCard = findViewById<LinearLayout>(R.id.rajmaCard)
        val jowarCard = findViewById<LinearLayout>(R.id.jowarCard)

        searchEditText.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val text = s.toString().lowercase()

                val allCards = listOf(
                    redgramCard, moongdalCard, uraddalCard, chanadalCard,
                    groundnutCard, masoordalCard, greenpeasCard,
                    chickpeasCard, rajmaCard, jowarCard
                )

                // Hide all first
                for (card in allCards) {
                    card.visibility = View.GONE
                }

                when {
                    text.contains("redgram") -> redgramCard.visibility = View.VISIBLE
                    text.contains("moongdal") -> moongdalCard.visibility = View.VISIBLE
                    text.contains("uraddal") -> uraddalCard.visibility = View.VISIBLE
                    text.contains("chanadal") -> chanadalCard.visibility = View.VISIBLE
                    text.contains("groundnut") -> groundnutCard.visibility = View.VISIBLE
                    text.contains("masoordal") -> masoordalCard.visibility = View.VISIBLE
                    text.contains("greenpeas") -> greenpeasCard.visibility = View.VISIBLE
                    text.contains("chickpeas") -> chickpeasCard.visibility = View.VISIBLE
                    text.contains("rajma") -> rajmaCard.visibility = View.VISIBLE
                    text.contains("jowar") -> jowarCard.visibility = View.VISIBLE

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

            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )

        }



        // ---------------- ADD BUTTON 1 ----------------
        val cartButton1 = findViewById<Button>(R.id.cartButton1)

        cartButton1.setOnClickListener {

            CartManager.addItem(
                Product("Toordal",160,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- ADD BUTTON 2 ----------------
        val cartButton2 = findViewById<Button>(R.id.cartButton2)

        cartButton2.setOnClickListener {

            CartManager.addItem(
                Product("Moongdal",120,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- ADD BUTTON 3 ----------------
        val cartButton3 = findViewById<Button>(R.id.cartButton3)

        cartButton3.setOnClickListener {

            CartManager.addItem(
                Product("Uraddal",130,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- ADD BUTTON 4 ----------------
        val cartButton4 = findViewById<Button>(R.id.cartButton4)

        cartButton4.setOnClickListener {

            CartManager.addItem(
                Product("chanadal",100,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }


        // ---------------- BUTTON 5 ----------------
        val cartButton5 = findViewById<Button>(R.id.cartButton5)

        cartButton5.setOnClickListener {

            CartManager.addItem(
                Product("Groundnut",120,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 6 ----------------
        val cartButton6 = findViewById<Button>(R.id.cartButton6)

        cartButton6.setOnClickListener {

            CartManager.addItem(
                Product("Masoordal",90,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 7 ----------------
        val cartButton7 = findViewById<Button>(R.id.cartButton7)

        cartButton7.setOnClickListener {
            CartManager.addItem(
                Product("greenpeas",90,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 8 ----------------
        val cartButton8 = findViewById<Button>(R.id.cartButton8)

        cartButton8.setOnClickListener {

            CartManager.addItem(
                Product("Chickpeas",90,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 9 ----------------
        val cartButton9 = findViewById<Button>(R.id.cartButton9)

        cartButton9.setOnClickListener {

            CartManager.addItem(
                Product("rajma",130,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 10 ----------------
        val cartButton10 = findViewById<Button>(R.id.cartButton10)

        cartButton10.setOnClickListener {
            CartManager.addItem(
                Product("Jowar",50,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }
    }
}