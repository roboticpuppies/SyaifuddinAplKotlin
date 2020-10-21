package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun submit_nama(view: View){
        val et_nama = findViewById<EditText>(R.id.et_nama)
        val nama = et_nama.text.toString()

        val toast = Toast.makeText(applicationContext, nama, Toast.LENGTH_SHORT).show()
    }
}