package com.example.receivetheresponse

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val root_layout2 =findViewById<View>(R.id.root_layout2)
        val animDrawable = root_layout2.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(5000)
        animDrawable.start()

        val intent = intent
        val name = intent.getStringExtra("Name")
        val email = intent.getStringExtra("Email")
        val phone = intent.getStringExtra("Phone")

        val resultTv = findViewById<TextView>(R.id.resultTv)
        resultTv.text = "Name: "+name+"\nEmail: "+email+"\nPhone: "+phone
    }
}