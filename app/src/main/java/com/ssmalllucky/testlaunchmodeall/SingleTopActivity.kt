package com.ssmalllucky.testlaunchmodeall

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SingleTopActivity : AppCompatActivity() {

    var isFisrtIntent = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG", "SingleTopActivity: $this")
        if (isFisrtIntent) {
            startActivity(Intent(this, SingleTopActivity::class.java))
            isFisrtIntent = false
        }
    }
}