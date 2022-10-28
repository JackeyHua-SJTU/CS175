package com.example.lab_2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Activity_2 : AppCompatActivity() {
    private val itemList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        for (i in 1..100) {
            itemList.add("这是item $i")
        }
        val layoutManager = LinearLayoutManager(this)
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        val adapter = ItemAdapter(itemList)
        recyclerView.adapter = adapter

    }
}