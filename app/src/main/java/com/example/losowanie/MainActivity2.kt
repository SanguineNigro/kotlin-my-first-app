package com.example.losowanie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        losuj.setOnClickListener {
            fun main() {
                val diceRange = 1..6
                val randomString = diceRange.random()
                println("Random number: ${randomString}")
            }
            fun main() {
                val myFirstDice = Dice ()
                println(myFirstDice.sides)
                myFirstDice.roll()
            }

            class Dice {
                var sides = 6

                fun roll() {
                    val randomString = (1..6).random()
                    println(randomString)
                }
            }
    }
}