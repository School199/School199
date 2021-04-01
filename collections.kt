package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Mutable is a type of variable that can be changed.
        /*Two ways to create a mutable list in Kotlin.
        Results are the same,bothe will create an ArrayList*/
        val daysInWeek = ArrayList<String>()
        daysInWeek.add("Monday")
        daysInWeek.add("Tuesday")
        daysInWeek.add("Wednesday")
        daysInWeek.add("Thursday")
        daysInWeek.add("Friday")
        daysInWeek.add("Saturday")
        daysInWeek.add("Sunday")
        val DaysInWeek = mutableListOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        println(daysInWeek)
        println(DaysInWeek)

    }
}
