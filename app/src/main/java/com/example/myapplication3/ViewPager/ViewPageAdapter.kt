package com.example.myapplication3.ViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication3.Fragments.CallFragment
import com.example.myapplication3.Fragments.CameraFragment
import com.example.myapplication3.Fragments.ChatFragment

class ViewPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                CameraFragment()
            }
            1 -> {
                ChatFragment()
            }
            2 -> {
                CallFragment()
            }
            else -> {
                CameraFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
      return when (position) {
            0 -> {
                 "Camera"
            }
            1 -> {
                 "Chat"
            }
            2 -> {
                 "Call"
            }
          else -> {
              "Status"
          }

        }

    }
}