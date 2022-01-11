package com.example.myapplication3.Fragments

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.myapplication3.HUNDRED
import com.example.myapplication3.R

class CameraFragment : Fragment() {

    lateinit var imageView: ImageView
    lateinit var btnImage: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_camera, container, false)
        btnImage = view.findViewById(R.id.btn_camera)
        imageView = view.findViewById(R.id.img_fragment)
        btnImage.setOnClickListener {
            pickImage()
        }
        return view
    }

    private fun pickImage() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        resultLauncher.launch((intent))
    }

    var resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
                val uri: Uri? = data?.data
                imageView.setImageURI(uri)
            } else {
                Toast.makeText(requireContext(), "Image not Available", Toast.LENGTH_LONG).show()
            }
        }
}