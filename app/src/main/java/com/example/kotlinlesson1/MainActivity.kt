package com.example.kotlinlesson1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var name: String? = "Name"
    private var hello: String? = "Hello"
    private var text: String? = "Text"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainClick()
    }

    val nameList = mutableListOf<String>("$name", "$hello", "$text")
    val passList = mutableListOf<String>("123", "123456")

    private fun mainClick() {
        btn_push.setOnClickListener {
            val username = ed_title.text.toString().trim()
            val password = ed_desc.text.toString().trim()
            checkUserDate(username, password)
        }
    }

    private fun checkUserDate(username: String, password: String) {
        if (nameList.contains(username) && passList.contains(password)) startActivity(
            Intent(
                this,
                SecondActivity::class.java
            )
                .putExtra("password", password)
                .putExtra("username", username)
        )
        else UiManager.showToast(this, "ERROR")
    }
}
