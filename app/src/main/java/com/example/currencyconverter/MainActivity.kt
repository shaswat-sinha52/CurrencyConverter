package com.example.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editfield: EditText=findViewById(R.id.edt)
        val button1:Button=findViewById(R.id.btn_1)
        val button2:Button=findViewById(R.id.btn_2)
        val result :TextView=findViewById(R.id.results)

        button2.setOnClickListener{
            val amt1=editfield.text.toString().toInt()
            val conv1=83*amt1
            result.text=conv1.toString()
        }

        button1.setOnClickListener{
            val amt2=editfield.text.toString().toInt()
            val conv2=amt2/83
            result.text=conv2.toString()
        }
    }
}