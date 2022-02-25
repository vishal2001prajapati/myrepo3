package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Spinner

class LinearLayout : AppCompatActivity() {

    lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)
        spinner = findViewById(R.id.item_spinner)
        val actionBar = supportActionBar
        actionBar?.apply {
            title = getString(R.string.linearlayout)
            setDisplayHomeAsUpEnabled(true)
        }
        val country = resources.getStringArray(R.array.country)
        val adapter = ArrayAdapter(this@LinearLayout, R.layout.custom_spiner, R.id.realative_text, country)
        spinner.adapter = adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}