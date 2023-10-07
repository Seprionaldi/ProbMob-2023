package com.example.progmob2023


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ProteinTrackerActivity : AppCompatActivity() {

    lateinit var btnSetting: Button
    private val myBtnLoginClick: View.OnClickListener = View.OnClickListener {
        val prefs = getSharedPreferences("prefs_file", MODE_PRIVATE)
        val statusLogin = prefs.getString("isLogin", null)
        val edit = prefs.edit()
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        if (statusLogin != null) {
            edit.putString("isLogin", null)
            btnLogin.text = "Login"
        } else {
            edit.putString("isLogin", "Admin")
            btnLogin.text = "Logout"
        }

        edit.apply()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_protein_tracker)

        val prefs = getSharedPreferences("prefs_file", MODE_PRIVATE)
        val statusLogin = prefs.getString("isLogin", null)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener(myBtnLoginClick)

        if (statusLogin != null) {
            btnLogin.text = "Logout"
        } else {
            btnLogin.text = "Login"
        }



        // Inisialisasi tombol
        btnSetting = findViewById(R.id.btnSetting)

        // Menangani klik tombol untuk membuka SettingActivity
        btnSetting.setOnClickListener {
            val intent = Intent(this, SettingProteinTracker::class.java)
            startActivity(intent)
        }
    }
//    private val myBtnLoginClick: View.OnClickListener = View.OnClickListener {
//        val prefs = getSharedPreferences("prefs_file", MODE_PRIVATE)
//        val statusLogin = prefs.getString("isLogin", null)
//        val edit = prefs.edit()
//        val btnLogin = findViewById<Button>(R.id.btnLogin)
//        btnLogin.setOnClickListener(myBtnLoginClick)
//
//
//        if (statusLogin != null) {
//            edit.putString("isLogin", null)
//            btnLogin.text = "Login"
//        } else {
//            edit.putString("isLogin", "Admin")
//            btnLogin.text = "Logout"
//        }
//
//        edit.apply()
    }



