package com.example.basicactivityswitching02.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.basicactivityswitching02.Adapter.SecondRecyclerAdapter
import com.example.basicactivityswitching02.R
import com.example.basicactivityswitching02.Service.Data
import com.example.basicactivityswitching02.Utilities.EXTRA_FIRST
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    lateinit var adapter: SecondRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val second = intent.getStringExtra(EXTRA_FIRST)
        adapter = SecondRecyclerAdapter(this, Data.second)

        val layoutManager = LinearLayoutManager(this)
        secondRecyclerView.layoutManager = layoutManager
        secondRecyclerView.adapter = adapter
    }
}