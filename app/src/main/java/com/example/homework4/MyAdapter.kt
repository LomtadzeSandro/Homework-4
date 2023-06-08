package com.example.homework4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val newslist : ArrayList<News>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        val titleIMG : ImageView = itemView.findViewById(R.id.titleIMG)
        val headlineTV : TextView = itemView.findViewById(R.id.headlineTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newslist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newslist[position]
        holder.titleIMG.setImageResource(currentItem.titleIMG)
        holder.headlineTV.text = currentItem.headline
    }
}