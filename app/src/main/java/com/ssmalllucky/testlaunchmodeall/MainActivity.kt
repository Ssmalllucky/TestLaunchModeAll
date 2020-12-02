package com.ssmalllucky.testlaunchmodeall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("TAG", "MainActivity's taskId: ${this.taskId}")
    }

    fun toStandard(view: View) {
        startActivity(Intent(this, StandardActivity::class.java))
    }

    fun toSingleTop(view: View) {
        startActivity(Intent(this, SingleTopActivity::class.java))
    }

    fun toSingleTask(view: View) {
        startActivity(Intent(this, SingleTaskActivity::class.java))
    }

    fun toSingleInstance(view: View) {
        startActivity(Intent(this, SingleInstanceActivity::class.java))
    }
}