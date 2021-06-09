package com.example.myapplication

import android.app.ActionBar
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.button_subscriberOOO).setOnClickListener {
            val intent = Intent(this, ClientsCardActivityOOO::class.java)
            startActivity(intent)

        }

        findViewById<Button>(R.id.button_tariff).setOnClickListener {
            val intent = Intent(this, ActivityTariff::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button_subscriberIP).setOnClickListener {
            val intent = Intent(this, ClientsCardActivityIP::class.java)
            startActivity(intent)
        }
    }
}