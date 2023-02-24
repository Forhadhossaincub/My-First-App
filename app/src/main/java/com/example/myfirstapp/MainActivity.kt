package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import android.widget.Toast as AndroidWidgetToast

class MainActivity : AppCompatActivity() {

    lateinit var mytextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mytextView = findViewById(R.id.mytextView)

    }

    fun saveChangeText(view: View) {
       android.widget.Toast.makeText(this,"Welcome", android.widget.Toast.LENGTH_SHORT).show()
        mytextView.text= "Welcome to My App"
    }



}