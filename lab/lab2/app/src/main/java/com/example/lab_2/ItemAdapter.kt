package com.example.lab_2

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val itemList : List<String>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val itemID : TextView = view.findViewById(R.id.textID)
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.itemID.text = item
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_2_child, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            val item = itemList[position]
            val intent = Intent(parent.context, ContentActivity::class.java)
            intent.putExtra("source", item)
            parent.context.startActivity(intent)
        }
        return ViewHolder(view)
    }
}