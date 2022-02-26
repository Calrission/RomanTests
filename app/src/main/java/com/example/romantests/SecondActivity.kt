package com.example.romantests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

fun sumA (texts: List<String>): Int {
    return texts.sumOf{it.count{sim -> sim == 'а'}}
}

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        check_button_2.setOnClickListener {
            val listTexts = arrayListOf(text_1.text.toString(), text_2.text.toString(), text_3.text.toString())
            Toast.makeText(applicationContext, sumA(listTexts).toString(), Toast.LENGTH_LONG).show()
        }
    }
}