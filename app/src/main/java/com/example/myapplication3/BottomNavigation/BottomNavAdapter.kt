package com.example.myapplication3.BottomNavigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication3.ONE
import com.example.myapplication3.THREE
import com.example.myapplication3.TWO
import com.example.myapplication3.ZERO

class BottomNavAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return THREE
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            ZERO -> {
                HomeFragment()
            }
            ONE -> {
                SearchFragment()
            }
            TWO -> {
                ProfileFragment()
            }
            else -> {
                HomeFragment()
            }
        }
    }
}