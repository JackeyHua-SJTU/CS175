package com.example.lab_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView1 : TextView = findViewById(R.id.textView1)
        textView1.setOnClickListener {
            val intent = Intent(this, Activity_1::class.java)
            startActivity(intent)
        }

        val textView2 : TextView = findViewById(R.id.textView2)
        textView2.setOnClickListener {
            val intent = Intent(this, Activity_2::class.java)
            startActivity(intent)
        }
    }
}