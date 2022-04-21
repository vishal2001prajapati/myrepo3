package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3.ActivityAndFragment.LifeCycleActivity
import com.example.myapplication3.BottomNavigation.BottomNavigationViewActivity
import com.example.myapplication3.ExapndableListView.ExpandableListViewActivity
import com.example.myapplication3.ExpandableRecyclerView.ExpandableRecyclerViewActivity
import com.example.myapplication3.GridWithRecycler.GridWithRecyclerActivity
import com.example.myapplication3.ListView.ListViewActivity
import com.example.myapplication3.RecyclerView.RecyclerView
import com.example.myapplication3.ViewPager.ViewPagerActivity
import com.example.myapplication3.ViewPagerTwo.ViewPagerTwoActivity
import com.example.myapplication3.ViewPagerWithRecycler.ViewPagerWithRecyclerActivity
import com.example.myapplication3.wbview.WebViewActivity

class DiffrentLayout : AppCompatActivity() {

    lateinit var btnlinear: Button
    lateinit var btnrelative: Button
    lateinit var btnconstrain: Button
    lateinit var btngrid: Button
    lateinit var btnframe: Button
    lateinit var btnlist: Button
    lateinit var recyclerViewButton: Button
    lateinit var gridrecycler: Button
    lateinit var btnviewpager: Button
    lateinit var btnviewpagerrecycler: Button
    lateinit var btnviewpagertwo: Button
    lateinit var btnnavigation: Button
    lateinit var btnexpandablelistview: Button
    lateinit var btnExpandableRecyclerView: Button
    lateinit var btnViewPagerRecyclerView: Button
    lateinit var btnBottomNavigationView: Button
    lateinit var btnLifeCycle: Button
    lateinit var btnWebView: Button
    lateinit var btnAPIRecyclerView: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diffrent_layout)
        val actionBar = supportActionBar
        actionBar?.apply {
            title = getString(R.string.layout)
            setDisplayHomeAsUpEnabled(true)
        }
        btnlinear = findViewById(R.id.btnLinear)
        btnrelative = findViewById(R.id.btnRecycler)
        btnconstrain = findViewById(R.id.btnConstrain)
        btngrid = findViewById(R.id.btnGrid)
        btnframe = findViewById(R.id.btnFrame)
        btnlist = findViewById(R.id.itemListView)
        recyclerViewButton = findViewById(R.id.btnRecycler)
        gridrecycler = findViewById(R.id.btnGridRecycler)
        btnviewpager = findViewById(R.id.btnViewPager)
        btnviewpagerrecycler = findViewById(R.id.btnViewPagerRecycler)
        btnviewpagertwo = findViewById(R.id.btnViewPagerTwo)
        btnnavigation = findViewById(R.id.btnNavigation)
        btnexpandablelistview = findViewById(R.id.btnExpandableListView)
        btnLifeCycle = findViewById(R.id.lifeCycle)
        btnWebView = findViewById(R.id.webView)
        btnAPIRecyclerView = findViewById(R.id.apiWithRecyclerView)
        btnWebView.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }
        btnLifeCycle.setOnClickListener {
            val intent = Intent(this, LifeCycleActivity::class.java)
            startActivity(intent)
        }
        btnBottomNavigationView.setOnClickListener {
            val intent = Intent(this, BottomNavigationViewActivity::class.java)
            startActivity(intent)
        }
        btnViewPagerRecyclerView.setOnClickListener {
            val intent = Intent(this, ViewPagerWithRecyclerActivity::class.java)
            startActivity(intent)
        }
        btnviewpager.setOnClickListener {
            val intent = Intent(this, ViewPagerActivity::class.java)
            startActivity(intent)
        }
        btnviewpagertwo.setOnClickListener {
            val intent = Intent(this, ViewPagerTwoActivity::class.java)
            startActivity(intent)
        }
        btnExpandableRecyclerView.setOnClickListener {
            val intent = Intent(this, ExpandableRecyclerViewActivity::class.java)
            startActivity(intent)
        }
        btnexpandablelistview.setOnClickListener {
            val intent = Intent(this, ExpandableRecyclerViewActivity::class.java)
            startActivity(intent)
        }
        btnexpandablelistview.setOnClickListener {
            val intent = Intent(this, ExpandableListViewActivity::class.java)
            startActivity(intent)
        }
        btnlist.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }
        recyclerViewButton.setOnClickListener {
            val intent = Intent(this, RecyclerView::class.java)
            startActivity(intent)
        }
        gridrecycler.setOnClickListener {
            val intent = Intent(this, GridWithRecyclerActivity::class.java)
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