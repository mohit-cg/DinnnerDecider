package com.codogram.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Star Bucks", "Pizza Hut", "McDonalds", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val decideBtn = findViewById<Button>(R.id.decideBtn)
        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())

            val selectedFoodTxt = findViewById<TextView>(R.id.selectedFoodTxt)
            selectedFoodTxt.text =foodList[randomFood]

        }

        val addFoodTxt = findViewById<TextView>(R.id.addFoodTxt)
        val addFoodBtn = findViewById<Button>(R.id.addFoodBtn)
        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text = ""
            println(foodList)
        }

    }
}






