package com.example.myapplication3.ViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication3.*
import com.example.myapplication3.Fragments.CallFragment
import com.example.myapplication3.Fragments.CameraFragment
import com.example.myapplication3.Fragments.ChatFragment

class ViewPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return THREE
    }

    override fun getItem(position: Int): Fragment {
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

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            ZERO -> {
                getPageTitle(R.string.camera)
            }
            ONE -> {
                getPageTitle(R.string.chat)
            }
            TWO -> {
                getPageTitle(R.string.call)
            }
            else -> {
                getPageTitle(R.string.status)
            }
        }
    }
}