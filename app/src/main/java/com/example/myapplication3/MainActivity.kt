package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button_ok)
        button.setOnClickListener {

            Toast.makeText(this, getString(R.string.toastmessage), Toast.LENGTH_LONG).show()
            val intent = Intent(this, DiffrentLayout::class.java)
            startActivity(intent)
        }
        val toast: TextView = findViewById(R.id.textview)
        toast.setOnClickListener {
            showtoast()
        }
    }

    private fun showtoast() {
        val inflater: LayoutInflater = layoutInflater
        val view: View = inflater.inflate(R.layout.custom_toast, findViewById(R.id.custom))
        val toast: Toast = Toast(this)
        toast.setGravity(Gravity.BOTTOM or Gravity.FILL_HORIZONTAL, 0, 0)
        toast.duration = Toast.LENGTH_LONG
        toast.view = view
        toast.show()
    }
}