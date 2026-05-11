package com.example.groceryapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class homePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_page)

        // Button 1
        val nextButton1 = findViewById<ImageButton>(R.id.nextButton1)

        nextButton1.setOnClickListener {

            val intent = Intent(this, homePage1::class.java)
            startActivity(intent)

            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
        }

        // Button 2
        val nextButton2 = findViewById<ImageButton>(R.id.nextButton2)

        nextButton2.setOnClickListener {

            val intent = Intent(this, homePage2::class.java)
            startActivity(intent)

            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
        }

        // Button 3
        val nextButton3 = findViewById<ImageButton>(R.id.nextButton3)

        nextButton3.setOnClickListener {

            val intent = Intent(this, homePage3::class.java)
            startActivity(intent)

            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )

        }

        // Button 4
        val nextButton4 = findViewById<ImageButton>(R.id.nextButton4)

        nextButton4.setOnClickListener {

            val intent = Intent(this, homePage4::class.java)
            startActivity(intent)

            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
        }
    }
}