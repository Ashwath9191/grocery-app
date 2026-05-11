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
class homePage3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_page3)

        val searchEditText = findViewById<EditText>(R.id.searchEditText)

        val sunscreenCard = findViewById<LinearLayout>(R.id.sunscreenCard)
        val pasteCard = findViewById<LinearLayout>(R.id.pasteCard)
        val powderCard = findViewById<LinearLayout>(R.id.powderCard)
        val oilCard = findViewById<LinearLayout>(R.id.oilCard)
        val moisturizerCard = findViewById<LinearLayout>(R.id.moisturizerCard)
        val bodywashCard = findViewById<LinearLayout>(R.id.bodywashCard)
        val soapCard = findViewById<LinearLayout>(R.id.soapCard)
        val shampooCard = findViewById<LinearLayout>(R.id.shampooCard)
        val detergentCard = findViewById<LinearLayout>(R.id.detergentCard)
        val handwashCard = findViewById<LinearLayout>(R.id.handwashCard)

        searchEditText.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val text = s.toString().lowercase()

                val allCards = listOf(
                    sunscreenCard, pasteCard, powderCard, oilCard,
                    moisturizerCard, bodywashCard, soapCard,
                    shampooCard, detergentCard, handwashCard
                )

                // Hide all first
                for (card in allCards) {
                    card.visibility = View.GONE
                }

                when {
                    text.contains("sunscreen") -> sunscreenCard.visibility = View.VISIBLE
                    text.contains("paste") -> pasteCard.visibility = View.VISIBLE
                    text.contains("powder") -> powderCard.visibility = View.VISIBLE
                    text.contains("oil") -> oilCard.visibility = View.VISIBLE
                    text.contains("moisturizer") -> moisturizerCard.visibility = View.VISIBLE
                    text.contains("bodywash") -> bodywashCard.visibility = View.VISIBLE
                    text.contains("soap") -> soapCard.visibility = View.VISIBLE
                    text.contains("shampoo") -> shampooCard.visibility = View.VISIBLE
                    text.contains("detergent") -> detergentCard.visibility = View.VISIBLE
                    text.contains("handwash") -> handwashCard.visibility = View.VISIBLE

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
                R.anim.slide_out_right
            )

        }



        // ---------------- ADD BUTTON 1 ----------------
        val cartButton1 = findViewById<Button>(R.id.cartButton1)

        cartButton1.setOnClickListener {

            CartManager.addItem(
                Product("Sunscreen", 290, 1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- ADD BUTTON 2 ----------------
        val cartButton2 = findViewById<Button>(R.id.cartButton2)

        cartButton2.setOnClickListener {

            CartManager.addItem(
                Product("Toothpaste", 75, 1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- ADD BUTTON 3 ----------------
        val cartButton3 = findViewById<Button>(R.id.cartButton3)

        cartButton3.setOnClickListener {

            CartManager.addItem(
                Product("Powder", 120, 1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- ADD BUTTON 4 ----------------
        val cartButton4 = findViewById<Button>(R.id.cartButton4)

        cartButton4.setOnClickListener {

            CartManager.addItem(
                Product("Hair Oil", 110, 1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }


        // ---------------- BUTTON 5 ----------------
        val cartButton5 = findViewById<Button>(R.id.cartButton5)

        cartButton5.setOnClickListener {

            CartManager.addItem(
                Product("Moisturizer", 500, 1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 6 ----------------
        val cartButton6 = findViewById<Button>(R.id.cartButton6)

        cartButton6.setOnClickListener {

            CartManager.addItem(
                Product("Bodywash", 300, 1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 7 ----------------
        val cartButton7 = findViewById<Button>(R.id.cartButton7)

        cartButton7.setOnClickListener {

            CartManager.addItem(
                Product("Soap", 40, 1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 8 ----------------
        val cartButton8 = findViewById<Button>(R.id.cartButton8)

        cartButton8.setOnClickListener {
            CartManager.addItem(Product("Shampoo", 70, 1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 9 ----------------
        val cartButton9 = findViewById<Button>(R.id.cartButton9)

        cartButton9.setOnClickListener {

            CartManager.addItem(
                Product("Detergent", 350, 1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 10 ----------------
        val cartButton10 = findViewById<Button>(R.id.cartButton10)

        cartButton10.setOnClickListener {

            CartManager.addItem(
                Product("Handwash", 80, 1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }
    }
}