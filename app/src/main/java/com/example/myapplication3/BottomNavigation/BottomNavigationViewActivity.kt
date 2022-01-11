package com.example.myapplication3.BottomNavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication3.R
import com.example.myapplication3.ViewPager.ViewPageAdapter
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_bottom_navigation_view.*
import kotlinx.android.synthetic.main.activity_view_pager.*

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
                    viewPager2.setCurrentItem(0, true)
                }
                R.id.text_search -> {
                    viewPager2.setCurrentItem(1, true)
                }
                R.id.text_profile -> {
                    viewPager2.setCurrentItem(2, true)

                }
                else -> {
                    viewPager2.setCurrentItem(0, true)
                }
            }
            true
        }
        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when (position) {
                    0 -> bottomNavigationView.selectedItemId = R.id.text_home
                    1 -> bottomNavigationView.selectedItemId = R.id.text_search
                    2 -> bottomNavigationView.selectedItemId = R.id.text_profile
                }
            }
        })
    }
}