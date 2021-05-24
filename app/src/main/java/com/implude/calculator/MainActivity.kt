package com.implude.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var result: TextView
    lateinit var plus: Button
    lateinit var minus: Button
    lateinit var division: Button
    lateinit var multiply
            : Button
    var inum1: Double = 0.0
    var inum2: Double = 0.0
    var rnum: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO: MAke it!
        //TODO 버튼 추가하고 막 하고 하기
        num1 = findViewById(R.id.number1) as EditText
        num2 = findViewById(R.id.number2) as EditText
        result = findViewById(R.id.textView3) as TextView
        plus = findViewById(R.id.plus) as Button
        minus = findViewById(R.id.minus) as Button
        multiply = findViewById(R.id.multi) as Button
        division = findViewById(R.id.division) as Button




        plus.setOnClickListener({
            inum1 = num1.text.toString().toDouble()
            inum2 = num2.text.toString().toDouble()
            result.text=(inum1+inum2).toString()
        })
        minus.setOnClickListener({
            inum1= num1.text.toString().toDouble()
            inum2= num2.text.toString().toDouble()
            result.text=(inum1-inum2).toString()
        })
        multiply.setOnClickListener({
            inum1= num1.text.toString().toDouble()
            inum2= num2.text.toString().toDouble()
            result.text=(inum1*inum2).toString()
        })
        division.setOnClickListener({
            inum1= num1.text.toString().toDouble()
            inum2= num2.text.toString().toDouble()
            result.text=(inum1/inum2).toString()
        })
    }
}
