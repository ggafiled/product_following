package com.example.productfollowing

import android.R
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SplashScreenActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var _mainIntent = Intent(this@SplashScreenActivity, MainActivity::class.java)
        startActivity(_mainIntent)
        finish()
    }
}