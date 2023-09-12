package com.example.progmob2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    lateinit var tvMain :TextView
    lateinit var  btnMain : Button
    lateinit var btnConst : Button
    lateinit var btnHelp : Button
    lateinit var btnlinear : Button
    lateinit var btnTabel : Button
    lateinit var  edInputNama : EditText
    lateinit var btnProtein : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.textView2)
        tvMain.text = "hello Progmob 2023"

        btnMain = findViewById(R.id.btnMain)

        btnMain.text = getString(R.string.progmob_2023)


        btnHelp = findViewById(R.id.btnHelp)
//        btnHelp = getString(R.string.progmob_2023)
        btnConst = findViewById(R.id.btnCons)
        btnProtein = findViewById(R.id.btnProtein)

        btnlinear = findViewById(R.id.btnlinear)
        btnTabel = findViewById(R.id.btnTabel)



        edInputNama = findViewById(R.id.ed_input1)

        btnMain.setOnClickListener(View.OnClickListener { view ->
            tvMain.text = edInputNama.text.toString()
        })



        btnHelp.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity,
                HelpActivity2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnlinear.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity,
                LinearActivity2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnConst.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity,
                activity_constraint::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnTabel.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity,
                TabelActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

        btnProtein.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity,
                ProteinTrackerActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })

    }
}