package com.example.myapplication3.ActivityAndFragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication3.R

class FragmentLifecycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_lifecycle)
        val lifeCycleFragment = LifeCycleFragment()
        val manger: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = manger.beginTransaction()
        transaction.apply {
            add(R.id.frame_layout, lifeCycleFragment)
            commit()
        }
    }
}