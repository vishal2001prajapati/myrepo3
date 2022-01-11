package com.example.myapplication3.ActivityAndFragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myapplication3.R

class LifeCycleFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("fragment", "Fragment Attach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("fragment", "Fragment create")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("fragment", "Fragment createView")
        return inflater.inflate(R.layout.fragment_life_cycle, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("fragment", "Fragment ActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("fragment", "Fragment Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("fragment", "Fragment Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("fragment", "Fragment Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("fragment", "Fragment Stop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("fragment", "Fragment DestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("fragment", "Fragment Destroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("fragment", "Fragment Detach")
    }
}