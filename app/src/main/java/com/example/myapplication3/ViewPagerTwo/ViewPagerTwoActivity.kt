package com.example.myapplication3.ViewPagerTwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication3.ONE
import com.example.myapplication3.R
import com.example.myapplication3.TWo
import com.example.myapplication3.ZERO
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerTwoActivity : AppCompatActivity() {

    lateinit var viewpagertwo: ViewPager2
    lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager_two)
        viewpagertwo = findViewById(R.id.viewpager_two)
        tabLayout = findViewById(R.id.viewpagertwo_tablayout)

        viewpagertwo.adapter = ViewPagerTwoAdapter(this.supportFragmentManager, lifecycle)
        TabLayoutMediator(tabLayout, viewpagertwo) { tab, position ->
            when (position) {
                ZERO -> {
                    tab.text = "Call"
                }
                ONE -> {
                    tab.text = "Camera"
                }
                TWo -> {
                    tab.text = "Chat"
                }
            }

        }.attach()
    }
}