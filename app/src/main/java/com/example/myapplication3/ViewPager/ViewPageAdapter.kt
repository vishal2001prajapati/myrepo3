package com.example.myapplication3.ViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication3.Fragments.CallFragment
import com.example.myapplication3.Fragments.CameraFragment
import com.example.myapplication3.Fragments.ChatFragment
import com.example.myapplication3.ONE
import com.example.myapplication3.TWo
import com.example.myapplication3.ZERO

class ViewPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            ZERO -> {
                CameraFragment()
            }
            ONE -> {
                ChatFragment()
            }
            TWo -> {
                CallFragment()
            }
            else -> {
                CameraFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            ZERO -> {
                "Camera"
            }
            ONE -> {
                "Chat"
            }
            TWo -> {
                "Call"
            }
            else -> {
                "Status"
            }
        }
    }
}