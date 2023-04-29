package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity7 : AppCompatActivity() {
    lateinit var tilbutton9:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        tilbutton9=findViewById(R.id.tilbutton9)
        tilbutton9.setOnClickListener {
            val intent= Intent(this, MainActivity6::class.java )
            startActivity(intent)}
        }
    }
