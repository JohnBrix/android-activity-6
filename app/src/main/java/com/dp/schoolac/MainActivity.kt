package com.dp.schoolac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input = findViewById<EditText>(R.id.textField)
        var display = findViewById<TextView>(R.id.display)
        var btn = findViewById<Button>(R.id.submit)
        var card = findViewById<Button>(R.id.card)

        btn.setOnClickListener{
            display.setText(input.text)
        }

        card.setOnClickListener{
            val intent = Intent(this,SecondScreen::class.java)
            startActivity(intent)
            finish()
        }


    }
}