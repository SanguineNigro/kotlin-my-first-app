package com.example.dokonajwyboru

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {

    val decideList = arrayListOf(dodajemy)

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

            losuje.setOnClickListener {
                val random = Random
                val randomDecide = random.nextBoolean(decideList.count())

            }

    }
}