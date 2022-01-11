package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import com.example.myapplication3.BottomNavigation.BottomNavigationViewActivity
import com.example.myapplication3.GridWithRecycler.GridWithRecycler
//import com.example.myapplication3.ListView.ListViewActivity
import com.example.myapplication3.RecyclerView.RecyclerView
import com.example.myapplication3.ViewPager.ViewPagerActivity
import com.example.myapplication3.ViewPagerTwo.ViewPagerTwoActivity
import com.example.myapplication3.ViewPagerWithRecycler.ViewPagerWithRecyclerActivity

class DiffrentLayout : AppCompatActivity() {
    lateinit var button: Button
    lateinit var buttonr: Button
    lateinit var buttoncon: Button
    lateinit var gridbtn: Button
    lateinit var framebutton: Button
    lateinit var listbutton: Button
    lateinit var recyclerViewbutton: Button
    lateinit var gridrecycler: Button
    lateinit var btnviewpager: Button
    lateinit var btnviewpagerrecycler: Button
    lateinit var btnviewpagertwo: Button
    lateinit var btnnavigation: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diffrent_layout)
        val actionBar = supportActionBar
        actionBar?.title = "Layouts"
        actionBar?.setDisplayHomeAsUpEnabled(true)
        button = findViewById(R.id.btnlinear)
        buttonr = findViewById(R.id.relative)
        buttoncon = findViewById(R.id.constrain)
        gridbtn = findViewById(R.id.grid)
        framebutton = findViewById(R.id.frame)
        listbutton = findViewById(R.id.item_listView)
        recyclerViewbutton = findViewById(R.id.btn_recycler)
        gridrecycler = findViewById(R.id.btn_gridrecycler)
        btnviewpager = findViewById(R.id.btn_viewpager)
        btnviewpagerrecycler = findViewById(R.id.btn_viewpagerrecycler)
        btnviewpagertwo = findViewById(R.id.btn_viewpagertwo)
        btnnavigation = findViewById(R.id.btn_navigation)

        btnnavigation.setOnClickListener {
            val intent = Intent(this, BottomNavigationViewActivity::class.java)
            startActivity(intent)
        }
        btnviewpagertwo.setOnClickListener {
            val intent = Intent(this, ViewPagerTwoActivity::class.java)
            startActivity(intent)
        }
        btnviewpagerrecycler.setOnClickListener {
            val intent = Intent(this, ViewPagerWithRecyclerActivity::class.java)
            startActivity(intent)
        }
        btnviewpager.setOnClickListener {
            val intent = Intent(this, ViewPagerActivity::class.java)
            startActivity(intent)
        }
        gridrecycler.setOnClickListener {
            val intent = Intent(this, GridWithRecycler::class.java)
            startActivity(intent)
        }
        recyclerViewbutton.setOnClickListener {
            val intent = Intent(this, RecyclerView::class.java)
            startActivity(intent)
        }
//        listbutton.setOnClickListener {
//            val intent = Intent(this, ListViewActivity::class.java)
//            startActivity(intent)
//        }
        framebutton.setOnClickListener {
            val intent = Intent(this, FrameLayout::class.java)
            startActivity(intent)
        }
        gridbtn.setOnClickListener {
            val intent = Intent(this, GridLayout::class.java)
            startActivity(intent)
        }
        buttonr.setOnClickListener {
            val intent = Intent(this, RelativeLayout::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            val intent = Intent(this, LinearLayout::class.java)
            startActivity(intent)
        }
        buttoncon.setOnClickListener {
            val intent = Intent(this, ConstrainLayout::class.java)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}