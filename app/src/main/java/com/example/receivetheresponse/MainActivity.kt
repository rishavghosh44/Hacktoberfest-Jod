package com.example.receivetheresponse

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val root_layout =findViewById<View>(R.id.root_layout)
        val animDrawable = root_layout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(5000)
        animDrawable.start()
        val nameEt = findViewById<EditText>(R.id.nameEt)
        val emailEt = findViewById<EditText>(R.id.emailET)
        val phoneEt = findViewById<EditText>(R.id.phoneEt)
        val saveBtn = findViewById<Button>(R.id.saveBtn)

        saveBtn.setOnClickListener {
            val name = nameEt.text.toString()
            val email = emailEt.text.toString()
            val phone = phoneEt.text.toString()

            val intent = Intent(this,Second::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Email", email)
            intent.putExtra("Phone", phone)
         startActivity(intent)
        }
    }
}