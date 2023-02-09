package com.example.basicactivityswitching02.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.basicactivityswitching02.Adapter.MainRecyclerAdapter
import com.example.basicactivityswitching02.R
import com.example.basicactivityswitching02.Service.Data
import com.example.basicactivityswitching02.Utilities.EXTRA_FIRST
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: MainRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = MainRecyclerAdapter(this, Data.first) { first ->
            val firstIntent = Intent(this, SecondActivity::class.java)
            firstIntent.putExtra(EXTRA_FIRST, first.title)
            startActivity(firstIntent)
        }
        val layoutManager = LinearLayoutManager(this)
        firstRecyclerView.layoutManager = layoutManager
        firstRecyclerView.adapter = adapter
    }
}