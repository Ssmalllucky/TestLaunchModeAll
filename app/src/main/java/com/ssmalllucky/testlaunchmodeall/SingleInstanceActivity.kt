package com.ssmalllucky.testlaunchmodeall

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SingleInstanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG", "SingleInstanceActivity's taskId: ${this.taskId}")
    }
}