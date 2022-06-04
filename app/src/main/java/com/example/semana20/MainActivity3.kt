package com.example.semana20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        actividad3.webChromeClient =object : WebChromeClient(){

        }
        actividad3.webViewClient =object : WebViewClient(){

        }
        actividad3.settings.javaScriptEnabled
        actividad3.loadUrl("https://estudiantes.ugb.edu.sv/Login?ReturnUrl=%2F")
    }
}