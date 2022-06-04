package com.example.semana20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        actividad2.webChromeClient =object : WebChromeClient(){

        }
        actividad2.webViewClient =object : WebViewClient(){

        }
        actividad2.settings.javaScriptEnabled
        actividad2.loadUrl("https://ugb.instructure.com/login/canvas")
    }
}