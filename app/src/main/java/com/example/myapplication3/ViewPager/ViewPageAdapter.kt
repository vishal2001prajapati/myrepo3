package com.example.myapplication3.ViewPager

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication3.*
import com.example.myapplication3.Fragments.CallFragment
import com.example.myapplication3.Fragments.CameraFragment
import com.example.myapplication3.Fragments.ChatFragment

class ViewPageAdapter(fm: FragmentManager,val context: Context) : FragmentPagerAdapter(fm) {

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
               return context.getString(R.string.camera)
            }
            ONE -> {
                return  context.getString(R.string.chat)
            }
            TWO -> {
                return context.getString(R.string.call)
            }
            else -> {
                super.getPageTitle(position)
            }
        }
    }
}