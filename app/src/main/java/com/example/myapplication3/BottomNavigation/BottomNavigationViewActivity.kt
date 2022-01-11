package com.example.myapplication3.BottomNavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication3.ONE
import com.example.myapplication3.R
import com.example.myapplication3.TWo
import com.example.myapplication3.ViewPager.ViewPageAdapter
import com.example.myapplication3.ZERO
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationViewActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation_view)
        bottomNavigationView = findViewById(R.id.text_bottomnavigation)
        viewPager2 = findViewById(R.id.viewpager_bottomnav)
        viewPager2.adapter = BottomNavAdapter(this.supportFragmentManager, lifecycle)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.text_home -> {
                    viewPager2.setCurrentItem(ZERO, true)
                }
                R.id.text_search -> {
                    viewPager2.setCurrentItem(ONE, true)
                }
                R.id.text_profile -> {
                    viewPager2.setCurrentItem(TWo, true)
                }
                else -> {
                    viewPager2.setCurrentItem(ZERO, true)
                }
            }
            true
        }
        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when (position) {
                    ZERO -> bottomNavigationView.selectedItemId = R.id.text_home
                    ONE -> bottomNavigationView.selectedItemId = R.id.text_search
                    TWo -> bottomNavigationView.selectedItemId = R.id.text_profile
                }
            }
        })
    }
}