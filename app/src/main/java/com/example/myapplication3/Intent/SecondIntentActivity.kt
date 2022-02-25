package com.example.myapplication3.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication3.R

class SecondIntentActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_intent)
        val userData = intent.getStringExtra(getString(R.string.data))
        textView = findViewById(R.id.text_data)
        textView.text = userData
    }
}