package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button

class DiffrentLayout : AppCompatActivity() {

    lateinit var btn_linear: Button
    lateinit var btn_relative: Button
    lateinit var btn_constrain: Button
    lateinit var btn_grid: Button
    lateinit var btn_frame: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diffrent_layout)
        val actionBar = supportActionBar
        actionBar?.apply {
            title = "Layouts"
            setDisplayHomeAsUpEnabled(true)
        }
        btn_linear = findViewById(R.id.btn_linear)
        btn_relative = findViewById(R.id.btn_relative)
        btn_constrain = findViewById(R.id.btn_constrain)
        btn_grid = findViewById(R.id.btn_grid)
        btn_frame = findViewById(R.id.btn_frame)
        btn_frame.setOnClickListener {
            val intent = Intent(this, FrameLayout::class.java)
            startActivity(intent)
        }
        btn_grid.setOnClickListener {
            val intent = Intent(this, GridLayout::class.java)
            startActivity(intent)
        }
        btn_relative.setOnClickListener {
            val intent = Intent(this, RelativeLayout::class.java)
            startActivity(intent)
        }
        btn_linear.setOnClickListener {
            val intent = Intent(this, LinearLayout::class.java)
            startActivity(intent)
        }
        btn_constrain.setOnClickListener {
            val intent = Intent(this, ConstrainLayout::class.java)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}