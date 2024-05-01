package com.example.assignment2imad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var ebuttonContinue :Button //variable for button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ebuttonContinue = findViewById(R.id.btn_welcome)
        ebuttonContinue.setOnClickListener {
            val NextPage = Intent(this,InteractionActivity::class.java) //To go to the next activity
            startActivity(NextPage)
        }
    }
}