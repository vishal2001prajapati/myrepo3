package com.example.myapplication3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.setFragmentResultListener
import com.example.myapplication3.R
import com.example.myapplication3.ViewPager.Communicator
import java.nio.file.Paths.get

class ChatFragment : Fragment() {

    lateinit var textView: TextView
    lateinit var displayMessage: String
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.text_fragment)
        displayMessage = arguments?.getString("message").toString()
        setFragmentResultListener("requestkey") { requestKey, bundle ->
            val result = bundle.getString("bundlekey")
            textView.text = result
        }
    }
}