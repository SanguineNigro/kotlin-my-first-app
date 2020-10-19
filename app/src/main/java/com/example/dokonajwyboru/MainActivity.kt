package com.example.dokonajwyboru

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wchodze.setOnClickListener {
            var message = Toast.makeText(applicationContext, "Dziękuję", Toast.LENGTH_SHORT)
            message.show()

            var newActivity: Intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(newActivity)

        }

        rezygnuje.setOnClickListener {
            var message =
                Toast.makeText(applicationContext, "Może innym razem?", Toast.LENGTH_SHORT)
            message.show()
        }
    }
}