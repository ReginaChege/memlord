package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    lateinit var tilbutton2:Button
    lateinit var tilbutton20:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        tilbutton20=findViewById(R.id.tilbutton20)
        tilbutton20.setOnClickListener {
            val intent=Intent(this, MainActivity4::class.java )
            startActivity(intent)
        }
        tilbutton2=findViewById(R.id.tilbutton2)
        tilbutton2.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}