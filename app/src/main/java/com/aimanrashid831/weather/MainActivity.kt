package com.aimanrashid831.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    private lateinit var linearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearButton = findViewById(R.id.linearButton)
        linearButton.setOnClickListener{
            val intent = Intent(this, WeatherLinearLayout::class.java)
            startActivity(intent)
        }
    }
}