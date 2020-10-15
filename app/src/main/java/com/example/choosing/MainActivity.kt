package com.example.choosing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wchodze.setOnClickListener {
            var message = Toast.makeText(applicationContext,"Dziękuję!",Toast.LENGTH_LONG)
            message.show()
        }

        rezygnuje.setOnClickListener {
            var message = Toast.makeText(applicationContext,"Może innym razem?",Toast.LENGTH_SHORT)
            message.show()
        }
    }
}