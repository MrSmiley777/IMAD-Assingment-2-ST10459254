package com.example.assignment2imad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class InteractionActivity : AppCompatActivity() {

    lateinit var ebtnFeed:Button
    lateinit var ebtnClean:Button
    lateinit var ebtnPlay:Button
    lateinit var etxtFeed:TextView
    lateinit var etxtClean:TextView
    lateinit var etxtPlay:TextView
    lateinit var eimageResponse:ImageView
    var feednumber = 0
    var cleannumber = 0
    var happynumber = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interaction)

        ebtnFeed=findViewById(R.id.btn_feed)
        ebtnClean=findViewById(R.id.btn_clean)
        ebtnPlay=findViewById(R.id.btn_play)

        etxtFeed=findViewById(R.id.txt_hunger)
        etxtClean=findViewById(R.id.txt_clean)
        etxtPlay=findViewById(R.id.txt_happy)

        eimageResponse=findViewById(R.id.imageView3)

        ebtnFeed.setOnClickListener {


            eimageResponse.setImageResource(R.drawable.eating)
            eimageResponse.tag="eating" //changes picture to eating everytime it is clicked

            if (feednumber == 100){
                Toast.makeText(applicationContext,"Bob is full",Toast.LENGTH_LONG).show()
                eimageResponse.setImageResource(R.drawable.waiting)
                eimageResponse.tag="waiting" //once bob is full it switches to waiting as he can no longer eat anymore
            }
            else {
                feednumber=feednumber+5 //adds 5 to the hunger stat
                etxtFeed.text=feednumber.toString()
            }
            if (feednumber==100 && cleannumber==100 && happynumber==100) {
                eimageResponse.setImageResource(R.drawable.celebrate)
                eimageResponse.tag = "celebrate" //changes to celebration picture once bob's stats are full
                Toast.makeText(applicationContext,"Bob is celebrating!",Toast.LENGTH_LONG).show()
            }
        }
        ebtnClean.setOnClickListener {


            eimageResponse.setImageResource(R.drawable.cleaning)
            eimageResponse.tag="cleaning" //changes picture to cleaning everytime it is clicked

            if (cleannumber == 100){
                Toast.makeText(applicationContext,"Bob is clean",Toast.LENGTH_LONG).show()
                eimageResponse.setImageResource(R.drawable.waiting)
                eimageResponse.tag="waiting" //once bob is cleaned it switches to waiting as he can no longer be cleaned anymore
            }
            else {
                cleannumber=cleannumber+5 //adds 5 to the clean stat
                etxtClean.text=cleannumber.toString()
            }
            if (feednumber==100 && cleannumber==100 && happynumber==100) {
                eimageResponse.setImageResource(R.drawable.celebrate)
                eimageResponse.tag = "celebrate" //changes to celebration picture once bob's stats are full
                Toast.makeText(applicationContext,"Bob is celebrating!",Toast.LENGTH_LONG).show()
            }
        }
        ebtnPlay.setOnClickListener {


            eimageResponse.setImageResource(R.drawable.playing)
            eimageResponse.tag="playing" //changes picture to playing everytime it is clicked

            if (happynumber == 100){
                Toast.makeText(applicationContext,"Bob is happy",Toast.LENGTH_LONG).show()
                eimageResponse.setImageResource(R.drawable.waiting)
                eimageResponse.tag="waiting" //once bob is done playing it switches to waiting as he can no longer play anymore
            }
            else {
                happynumber=happynumber+5 //adds 5 to the play stat
                etxtPlay.text=happynumber.toString()
            }
            if (feednumber==100 && cleannumber==100 && happynumber==100) {
                eimageResponse.setImageResource(R.drawable.celebrate)
                eimageResponse.tag = "celebrate" //changes to celebration picture once bob's stats are full
                Toast.makeText(applicationContext,"Bob is celebrating!",Toast.LENGTH_LONG).show()
            }
        }


    }
}