package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import java.util.*
import kotlin.random.Random as random

class MainActivity : ComponentActivity() {

    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            rollDice()
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        }
        diceImage = findViewById(R.id.dice_image)
//        setContent {
////            DiceRollerTheme {
////                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
////                    Greeting(
////                        name = "Geeta",
////                        modifier = Modifier.padding(innerPadding)
////                    )
////                }
////            }
//        }
    }

    private fun rollDice() {

        val randomInt = Random().nextInt(6) +1
        val drawableResource = when (randomInt)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6 }
        diceImage.setImageResource(drawableResource)
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    DiceRollerTheme {
//        Greeting("Android")
//    }
//}