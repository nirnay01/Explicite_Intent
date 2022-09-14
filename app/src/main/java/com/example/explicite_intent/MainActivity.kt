package com.example.explicite_intent

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    lateinit var mmessageedittext:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mmessageedittext=findViewById(R.id.edittext_name)
    }

    fun lounch2ndactivity(view: View) {
        Toast.makeText(this,"button is clicked",Toast.LENGTH_LONG).show()
        Log.d("mainactivity","button is clicked")
        var msg=mmessageedittext.text.toString()
        val intent=Intent(this,secondactivity::class.java)
            intent.putExtra("mainactivity1",msg)
        startActivity(intent)
    }
}