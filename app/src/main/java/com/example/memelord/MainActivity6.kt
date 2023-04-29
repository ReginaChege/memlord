package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity6 : AppCompatActivity() {
    lateinit var tilbutton11: Button
    lateinit var tilbutton7: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        tilbutton11=findViewById(R.id.tilbutton11)
        tilbutton11.setOnClickListener {
            val intent= Intent(this, MainActivity4::class.java )
            startActivity(intent)}

        tilbutton7=findViewById(R.id.tilbutton7)
        tilbutton7.setOnClickListener {
            val intent= Intent(this, MainActivity7::class.java )
            startActivity(intent)}
    }
}