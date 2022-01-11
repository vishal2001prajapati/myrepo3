package com.example.myapplication3.ActivityAndFragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3.R

class LifeCycleActivity : AppCompatActivity() {
    lateinit var btnfragment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        btnfragment = findViewById(R.id.btn_framecycle)
        btnfragment.setOnClickListener {
            val intent = Intent(this, FragmentLifecycleActivity::class.java)
            startActivity(intent)
        }
        Log.d("lifecycle", "Process Create")
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle", "Process Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle", "Process Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecycle", "Process Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle", "Process Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle", "Process Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle", "Process Destroy")
    }
}