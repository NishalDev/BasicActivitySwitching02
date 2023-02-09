package com.example.basicactivityswitching02.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.basicactivityswitching02.Model.First
import com.example.basicactivityswitching02.R

class MainRecyclerAdapter(val context: Context, val first: List<First>,val itemClick: (First)->Unit):RecyclerView.Adapter<MainRecyclerAdapter.Holder>() {
    inner class Holder(itemView: View,val itemClick: (First)->Unit):RecyclerView.ViewHolder(itemView)
    {
        val firstTitle = itemView?.findViewById<TextView>(R.id.firstTitle)
        fun bindFirst(first: First,context: Context){
            firstTitle?.text = first.title

            itemView.setOnClickListener { itemClick(first) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.first_list_item,parent,false)
        return Holder(view,itemClick)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindFirst(first[position],context)
    }

    override fun getItemCount(): Int {
        return first.count()
    }
}