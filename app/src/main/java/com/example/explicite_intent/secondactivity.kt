package com.example.explicite_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondactivity : AppCompatActivity() {
    lateinit var ttextview:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
        val intent=getIntent()
        ttextview=findViewById(R.id.text1)
       val m1:String?= intent.getStringExtra("mainactivity1")
        ttextview.text=m1
    }
}