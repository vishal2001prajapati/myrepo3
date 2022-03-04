package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3.ExapndableListView.ExpandableListViewActivity
import com.example.myapplication3.ExpandableRecyclerView.ExpandableRecyclerViewActivity
import com.example.myapplication3.GridWithRecycler.GridWithRecyclerActivity
import com.example.myapplication3.ListView.ListViewActivity
import com.example.myapplication3.RecyclerView.RecyclerView

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
        recyclerViewButton = findViewById(R.id.btn_recycler)
        gridrecycler = findViewById(R.id.btn_gridrecycler)
        btnviewpager = findViewById(R.id.btn_viewpager)
        btnviewpagerrecycler = findViewById(R.id.btn_viewpagerrecycler)
        btnviewpagertwo = findViewById(R.id.btn_viewpagertwo)
        btnnavigation = findViewById(R.id.btn_navigation)
        btnexpandablelistview = findViewById(R.id.btn_expandablelistview)
        recyclerViewButton = findViewById(R.id.btn_recycler)
        gridrecycler = findViewById(R.id.btn_gridrecycler)
        btnviewpager = findViewById(R.id.btn_viewpager)
        btnviewpagerrecycler = findViewById(R.id.btn_viewpagerrecycler)
        btnviewpagertwo = findViewById(R.id.btn_viewpagertwo)
        btnnavigation = findViewById(R.id.btn_navigation)
        btnexpandablelistview = findViewById(R.id.btn_expandablelistview)
        btnExpandableRecyclerView = findViewById(R.id.btn_expandablerecyclerview)
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