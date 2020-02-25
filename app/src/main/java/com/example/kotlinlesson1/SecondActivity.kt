package com.example.kotlinlesson1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        if (username == null && password == null) {
            UiManager.showToast(this, "Intent is null")
        } else {
            val msg = "Username: $username \n Password: $password"
            text_tv.text = msg
        }
    }
}
