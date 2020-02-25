package com.example.kotlinlesson1

import android.content.Context
import android.widget.Toast

class UiManager {
    companion object {
        fun showToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }
    }

}