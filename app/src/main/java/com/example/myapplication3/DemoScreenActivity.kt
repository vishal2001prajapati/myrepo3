package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class DemoScreenActivity : AppCompatActivity() {
    lateinit var btnBlue: Button
    lateinit var btnred: Button
    lateinit var textViewBlue: TextView
    lateinit var textViewRed: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_screen)
        textViewBlue = findViewById(R.id.textBlue)
        textViewRed = findViewById(R.id.textRed)
        btnBlue = findViewById(R.id.btnBlue)
        btnred = findViewById(R.id.btnRed)
        btnBlue.setOnClickListener {
            textViewBlue.isVisible = !textViewBlue.isVisible
        }
        btnred.setOnClickListener {
            textViewRed.isVisible = !textViewRed.isVisible
        }
    }
}