package com.example.myapplication3.wbview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webCall()
    }

    private fun webCall() {
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.instagram.com/")
        val webSetting = webView.settings
        webSetting.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)
    }
}