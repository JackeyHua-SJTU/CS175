package com.example.lab_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ContentActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        val name = intent.getStringExtra("source")
    }
}