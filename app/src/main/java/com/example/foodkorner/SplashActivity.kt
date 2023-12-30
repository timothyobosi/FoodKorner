package com.example.foodkorner

import android.content.Intent
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 3000L // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Use a Handler to delay the start of the main activity
        Handler().postDelayed({
            // Start the main activity after the splash timeout
            startActivity(Intent(this, RecipeListActivity::class.java))
            finish() // Close the splash activity
        }, SPLASH_TIME_OUT)

    }
}