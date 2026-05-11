package com.example.groceryapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class loginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Connect Kotlin with XML
        setContentView(R.layout.activity_main)

        // Access OTP EditText
        val otpEditText = findViewById<EditText>(R.id.otpEditText)

        // Access Verify Button
        val loginButton = findViewById<Button>(R.id.loginButton)

        // Button click event
        loginButton.setOnClickListener {

            // Get entered OTP
            val enteredOtp = otpEditText.text.toString()

            // Check OTP
            if (enteredOtp == "1234") {

                // Move to Home Page
                val intent = Intent(this, homePage::class.java)
                startActivity(intent)

            } else {

                // Wrong OTP message
                Toast.makeText(this, "Invalid OTP", Toast.LENGTH_SHORT).show()
            }
        }
    }
}