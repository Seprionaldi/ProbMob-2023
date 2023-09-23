package com.example.progmob2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class SampleList : AppCompatActivity() {

    lateinit var btnShowList: Button
    lateinit var btnSampleRV: Button
    lateinit var btnSampleCV: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnShowList = findViewById(R.id.btnShowList)
        btnSampleRV = findViewById(R.id.btnSampleRV)
        btnSampleCV =findViewById(R.id.btnSampleCV)

        btnShowList.setOnClickListener {
            // Memulai Activity SampleListView
            val intent = Intent(this, SampleListView::class.java)
            startActivity(intent)
        }

        btnSampleRV.setOnClickListener {
            // Memulai Activity SampleListView
            val intent = Intent(this, SampleRecyclerView::class.java)
            startActivity(intent)
        }
        btnSampleCV.setOnClickListener {
            // Memulai Activity SampleListView
            val intent = Intent(this, SampleCardView::class.java)
            startActivity(intent)
        }
    }
}