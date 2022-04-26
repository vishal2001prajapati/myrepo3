package com.example.myapplication3.ViewPager

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.myapplication3.R
import com.google.android.material.tabs.TabLayout

class ViewPagerActivity : AppCompatActivity() {

    lateinit var viewpager: ViewPager
    lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        supportActionBar?.let {
            title = getString(R.string.viewPager)
            it.setDisplayHomeAsUpEnabled(true)
        }
        viewpager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)
        viewpager.adapter = ViewPageAdapter(supportFragmentManager,this)
        tabLayout.setupWithViewPager(viewpager)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}