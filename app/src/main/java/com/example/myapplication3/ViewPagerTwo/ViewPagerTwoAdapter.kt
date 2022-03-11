package com.example.myapplication3.ViewPagerTwo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication3.*
import com.example.myapplication3.Fragments.CallFragment
import com.example.myapplication3.Fragments.CameraFragment
import com.example.myapplication3.Fragments.ChatFragment

class ViewPagerTwoAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return THREE
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            ZERO -> {
                CameraFragment()
            }
            ONE -> {
                ChatFragment()
            }
            TWO -> {
                CallFragment()
            }
            else -> {
                CameraFragment()
            }
        }
    }
}