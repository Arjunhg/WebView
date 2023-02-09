package com.example.webview11
//When we want our app to look like website
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewVariable = findViewById<WebView>(R.id.webView)
        webViewSetup(webViewVariable) // A method
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(a: WebView){ //In kotlin while making function just use fun keyword and then the method name. In bracket we have parameter a and its type is WebView
     a.webViewClient = WebViewClient() //In build method

     a.apply {
         settings.javaScriptEnabled = true
         settings.safeBrowsingEnabled = true
         loadUrl("https://www.linkedin.com/in/arjun-sharma-as/") //Most important.
     }
    }
}