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

    /**
     * This function is responsible for finding and displaying the amount of correct answers
     */

    private fun onButtonClick() {
        var antwoordgoed: Int = 0

        val answer1 = edtInput1.text.toString()
        val answer2 = edtInput2.text.toString()
        val answer3 = edtInput3.text.toString()
        val answer4 = edtInput4.text.toString()

        if (answer1 == "T") antwoordgoed++
        if (answer2 == "F") antwoordgoed++
        if (answer3 == "F") antwoordgoed++
        if (answer4 == "F") antwoordgoed++

        Toast.makeText(this, getString(R.string.result, antwoordgoed), Toast.LENGTH_SHORT).show()
    }
}
