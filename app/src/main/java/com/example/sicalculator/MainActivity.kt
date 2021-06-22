package com.example.sicalculator

import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import com.example.sicalculator.R

class MainActivity : AppCompatActivity() {


     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)


         val num1 = findViewById<EditText>(R.id.amt)
         val num2 = findViewById<EditText>(R.id.interest)
         val num3 = findViewById<EditText>(R.id.time)
         val b1 = findViewById<Button>(R.id.btn)
         val b2 = findViewById<Button>(R.id.btn2)
         val ans = findViewById<TextView>(R.id.output)
         val ans2 = findViewById<TextView>(R.id.output2)

         b1.setOnClickListener {
             val p = num1.text.toString().toInt()
             val r = num2.text.toString().toInt()
             val t = num3.text.toString().toFloat()
             val f = (p * r * t) / 100
             ans.text = (p+f).toString()
             ans2.text = f.toString()


             // Refresh button
             b2.setOnClickListener {
                 num1.setText("")
                 num2.setText("")
                 num3.setText("")
                 ans.text = ""
                 ans2.text = ""
             }

         }
     }
}


