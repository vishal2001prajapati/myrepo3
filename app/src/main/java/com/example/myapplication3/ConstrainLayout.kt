package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Spinner

class ConstrainLayout : AppCompatActivity() {

    lateinit var spinnercon: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constrain_layout)
        spinnercon = findViewById(R.id.spinner_constrain)
        val actionBar = supportActionBar
        actionBar?.apply {
            title = getString(R.string.constrainlayout)
            setDisplayHomeAsUpEnabled(true)
        }
        val country = resources.getStringArray(R.array.country)
        val adapter = ArrayAdapter(this@ConstrainLayout, R.layout.custom_spiner, R.id.realative_text, country)
        spinnercon.adapter = adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}