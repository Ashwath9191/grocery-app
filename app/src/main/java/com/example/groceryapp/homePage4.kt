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
class homePage4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_page4)

        val searchEditText = findViewById<EditText>(R.id.searchEditText)

        val almondCard = findViewById<LinearLayout>(R.id.almondCard)
        val cashewCard = findViewById<LinearLayout>(R.id.cashewCard)
        val pistaCard = findViewById<LinearLayout>(R.id.pistaCard)
        val datesCard = findViewById<LinearLayout>(R.id.datesCard)
        val kishmishCard = findViewById<LinearLayout>(R.id.kishmishCard)
        val walnutCard = findViewById<LinearLayout>(R.id.walnutCard)
        val apricotCard = findViewById<LinearLayout>(R.id.apricotCard)
        val angeerCard = findViewById<LinearLayout>(R.id.angeerCard)

        searchEditText.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val text = s.toString().lowercase()

                val allCards = listOf(
                    almondCard, cashewCard, pistaCard, datesCard,
                    kishmishCard, walnutCard, apricotCard,
                    angeerCard
                )

                // Hide all first
                for (card in allCards) {
                    card.visibility = View.GONE
                }

                when {
                    text.contains("almond") -> almondCard.visibility = View.VISIBLE
                    text.contains("cashew") -> cashewCard.visibility = View.VISIBLE
                    text.contains("pista") -> pistaCard.visibility = View.VISIBLE
                    text.contains("dates") -> datesCard.visibility = View.VISIBLE
                    text.contains("kishmish") -> kishmishCard.visibility = View.VISIBLE
                    text.contains("walnut") -> walnutCard.visibility = View.VISIBLE
                    text.contains("apricot") -> apricotCard.visibility = View.VISIBLE
                    text.contains("angeer") -> angeerCard.visibility = View.VISIBLE


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
                Product("Almond",90,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- ADD BUTTON 2 ----------------
        val cartButton2 = findViewById<Button>(R.id.cartButton2)

        cartButton2.setOnClickListener {

            CartManager.addItem(
                Product("Cashew",120,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- ADD BUTTON 3 ----------------
        val cartButton3 = findViewById<Button>(R.id.cartButton3)

        cartButton3.setOnClickListener {

            CartManager.addItem(
                Product("Pista",130,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- ADD BUTTON 4 ----------------
        val cartButton4 = findViewById<Button>(R.id.cartButton4)

        cartButton4.setOnClickListener {

            CartManager.addItem(
                Product("Dates",250,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }


        // ---------------- BUTTON 5 ----------------
        val cartButton5 = findViewById<Button>(R.id.cartButton5)

        cartButton5.setOnClickListener {

            CartManager.addItem(
                Product("Kishmish",60,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 6 ----------------
        val cartButton6 = findViewById<Button>(R.id.cartButton6)

        cartButton6.setOnClickListener {

            CartManager.addItem(
                Product("Walnut",120,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 7 ----------------
        val cartButton7 = findViewById<Button>(R.id.cartButton7)

        cartButton7.setOnClickListener {

            CartManager.addItem(
                Product("Apricot",100,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }

        // ---------------- BUTTON 8 ----------------
        val cartButton8 = findViewById<Button>(R.id.cartButton8)

        cartButton8.setOnClickListener {

            CartManager.addItem(
                Product("Angeer",130,1)
            )

            val intent = Intent(this, cartScreen1::class.java)
            startActivity(intent)
        }
    }
}