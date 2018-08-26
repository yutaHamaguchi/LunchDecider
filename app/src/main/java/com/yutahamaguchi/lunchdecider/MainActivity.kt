package com.yutahamaguchi.lunchdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "角の焼き肉屋", "駅前の中華料理", "マクドナルド", "富士そば")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       decideButton.setOnClickListener {
           val random = Random()
           val randomFood = random.nextInt(foodList.count())

           selectedFoodText.text = foodList[randomFood]



       }

        addFoodButton.setOnClickListener(){
            val newFood = addFoodText.text.toString()
            foodList.add(newFood)
            addFoodText.text.clear()
            println(foodList)


        }




    }
}
