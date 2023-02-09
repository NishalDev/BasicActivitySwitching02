package com.example.basicactivityswitching02.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.basicactivityswitching02.Model.Second
import com.example.basicactivityswitching02.R

class SecondRecyclerAdapter(val context: Context, val second: List<Second>): RecyclerView.Adapter<SecondRecyclerAdapter.Holder>() {
    inner class Holder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        val secondTitle = itemView?.findViewById<TextView>(R.id.secondTitle)

        fun bindSecond(second: Second,context: Context)
        {
            secondTitle?.text = second.title


        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.second_list_item,parent,false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindSecond(second[position],context)
    }

    override fun getItemCount(): Int {
        return second.count()
    }
}