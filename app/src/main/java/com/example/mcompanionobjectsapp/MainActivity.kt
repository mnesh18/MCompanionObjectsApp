package com.example.mcompanionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var tvText : TextView
    lateinit var etText: EditText
    lateinit var changeBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tvMain)
        etText = findViewById(R.id.etText)
        changeBtn = findViewById(R.id.button)

        changeBtn.setOnClickListener {
            val time = etText.text.toString().lowercase()

            when(time){
                "day" -> {
                    Time.changeBackground(findViewById(R.id.clMain), Time.day)
                    tvText.setTextColor(Color.BLACK)
                    etText.setTextColor(Color.BLACK)
                }
                "night" -> {
                    Time.changeBackground(findViewById(R.id.clMain), Time.night)
                    tvText.setTextColor(Color.WHITE)
                    etText.setTextColor(Color.WHITE)
                }
            }
        }
    }
}