package com.example.foodapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Base_Theme_FoodApp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}




