package com.example.basicactivityswitching02.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basicactivityswitching02.R
import com.example.basicactivityswitching02.Utilities.EXTRA_FIRST

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val second = intent.getStringExtra(EXTRA_FIRST)
    }
}