package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Spinner

class RelativeLayout : AppCompatActivity() {
    lateinit var spinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
        val actionBar = supportActionBar
        actionBar?.title = "RelativeLayout"
        actionBar?.setDisplayHomeAsUpEnabled(true)
        spinner = findViewById(R.id.relative_spinner)
        val country = resources.getStringArray(R.array.country)
        val adapter =
            ArrayAdapter(this@RelativeLayout, R.layout.custom_spiner, R.id.realative_text, country)
        spinner.adapter = adapter
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}