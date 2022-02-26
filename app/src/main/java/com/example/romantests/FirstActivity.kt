package com.example.romantests

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_first.*
import java.util.*

fun checkPassword(password: String): Boolean{
    val checkBigLetter = password != password.lowercase()
    val checkLittleLetter = password != password.uppercase()
    val checkExistDigit = password.any {it.isDigit()}
    val checkSpecialSim = password.any{!it.isLetter() && !it.isDigit() && it != ' '}
    return checkBigLetter && checkLittleLetter && checkExistDigit && checkSpecialSim
}

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        check_button.setOnClickListener {
            if (checkPassword(password_text.text.toString()))
                startActivity(Intent(this, SecondActivity::class.java))
            else
                Toast.makeText(applicationContext, "Пароль не соотвествует требованиям",
                    Toast.LENGTH_LONG).show()
        }
    }
}