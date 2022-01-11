package com.example.myapplication3.ViewPager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TableLayout
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.myapplication3.Fragments.CallFragment
import com.example.myapplication3.Fragments.ChatFragment
import com.example.myapplication3.ONE
import com.example.myapplication3.R
import com.example.myapplication3.TWo
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity : AppCompatActivity() {

    lateinit var viewpager: ViewPager
    lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        supportActionBar?.let {
            title = "ViewPager"
            it.setDisplayHomeAsUpEnabled(true)
        }
        viewpager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        viewPager.adapter = ViewPageAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
        supportFragmentManager.beginTransaction().replace(R.id.viewPager, CallFragment()).commit()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }

    fun itemChange() {
        viewpager.setCurrentItem(ONE, true)
    }
}
