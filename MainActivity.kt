package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstButton = findViewById<Button1>(R.id.firstButton)
        firstButton.setOnClickListener{

        }
        val secondButton = findViewById<Button2>(R.id.secondButton)
        secondButton.setOnClickLister{

        }
        val thirdButton = findViewById<Button3>(R.id.thirdButton)
        thirdButton.setOnClickLister{

        }
        val fourthButton = findViewById<Button4>(R.id.fourthButton)
        fourthButton.setOnClickLister{

        }
        val fifthButton = findViewById<Button5>(R.id.fifthButton)
        fifthButton.setOnClickLister{

        }
        val sixthButton = findViewById<Button6>(R.id.sixthButton)
        sixthButton.setOnClickLister{

        }
        val seventhButton = findViewById<Button7>(R.id.seventhButton)
        seventhButton.setOnClickLister{

        }
        val eighthButton = findViewById<Button8>(R.id.eightButton)
        eighthButton.setOnClickLister{

        }
    }
}
