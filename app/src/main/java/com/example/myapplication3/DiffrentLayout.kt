package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import com.example.myapplication3.ListView.ListViewActivity

class DiffrentLayout : AppCompatActivity() {

    lateinit var btnlinear: Button
    lateinit var btnrelative: Button
    lateinit var btnconstrain: Button
    lateinit var btngrid: Button
    lateinit var btnframe: Button
    lateinit var btnlist: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diffrent_layout)
        val actionBar = supportActionBar
        actionBar?.apply {
            title = "Layouts"
            setDisplayHomeAsUpEnabled(true)
        }
        btnlinear = findViewById(R.id.btn_linear)
        btnrelative = findViewById(R.id.btn_relative)
        btnconstrain = findViewById(R.id.btn_constrain)
        btngrid = findViewById(R.id.btn_grid)
        btnframe = findViewById(R.id.btn_frame)
        btnlist = findViewById(R.id.item_listView)
        btnlist.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }
        btnframe.setOnClickListener {
            val intent = Intent(this, FrameLayout::class.java)
            startActivity(intent)
        }
        btngrid.setOnClickListener {
            val intent = Intent(this, GridLayout::class.java)
            startActivity(intent)
        }
        btnrelative.setOnClickListener {
            val intent = Intent(this, RelativeLayout::class.java)
            startActivity(intent)
        }
        btnlinear.setOnClickListener {
            val intent = Intent(this, LinearLayout::class.java)
            startActivity(intent)
        }
        btnconstrain.setOnClickListener {
            val intent = Intent(this, ConstrainLayout::class.java)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}