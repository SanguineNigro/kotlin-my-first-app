package com.example.losowanie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wchodze.setOnClickListener {
            var message = Toast.makeText(applicationContext,"Dziękuję",Toast.LENGTH_SHORT)
        }
        rezygnuje.setOnClickListener {
            var message = Toast.makeText(applicationContext,"Może innym razem?",Toast.LENGTH_SHORT)
        }
    }
}