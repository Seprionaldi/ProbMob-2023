package com.example.progmob2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ServiceActivity : AppCompatActivity() {

    lateinit var  btnGetApi : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        btnGetApi = findViewById(R.id.btnGetAPI)

        btnGetApi.setOnClickListener {
            // Memulai Activity SampleListView
            val intent = Intent(this, GetAPIActivity::class.java)
            startActivity(intent)
        }
    }
}