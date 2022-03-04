package com.example.myapplication3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import com.example.myapplication3.R
import com.example.myapplication3.ViewPager.ViewPagerActivity

class CallFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_call, container, false)
        val editText: EditText = view.findViewById(R.id.edittext_info)
        val btnFragment: Button = view.findViewById(R.id.btn_fragment)
        btnFragment.setOnClickListener {
            val input = editText.text.toString()
            setFragmentResult("requestkey", bundleOf("bundlekey" to input))
            val activitChange = activity as ViewPagerActivity
            activitChange.itemChange()
        }
        return view
    }
}