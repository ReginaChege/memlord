package com.example.memelord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    lateinit var tilbutton4: Button
    lateinit var tilnext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        tilbutton4=findViewById(R.id.tilbutton4)
        tilbutton4.setOnClickListener {
            val intent= Intent(this, MainActivity3::class.java )
            startActivity(intent)}
        tilnext=findViewById(R.id.tilnext)
        tilnext.setOnClickListener {
            val intent=Intent(this, MainActivity6::class.java )
            startActivity(intent)}
    }
}