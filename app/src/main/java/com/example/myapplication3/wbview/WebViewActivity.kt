package com.example.myapplication3.wbview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.myapplication3.R
import com.example.myapplication3.WEBURL
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webCall()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun webCall() {
        webView.apply {
            webViewClient = WebViewClient()
            loadUrl(WEBURL)
            settings.apply {
                javaScriptEnabled = true
                setSupportZoom(true)
            }
        }
    }
}