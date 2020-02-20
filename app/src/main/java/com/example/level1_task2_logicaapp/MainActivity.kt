package com.example.level1_task2_logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCheck.setOnClickListener { onButtonClick() } //onClickListener for our button
    }



    private fun onButtonClick() {
        var antwoordgoed: Int = 0

        val answer1 = Input1.text.toString()
        val answer2 = Input2.text.toString()
        val answer3 = Input3.text.toString()
        val answer4 = Input4.text.toString()

        if (answer1 == "T") antwoordgoed++
        if (answer2 == "F") antwoordgoed++
        if (answer3 == "F") antwoordgoed++
        if (answer4 == "F") antwoordgoed++

        Toast.makeText(this, getString(R.string.result, antwoordgoed), Toast.LENGTH_SHORT).show()
    }
}
