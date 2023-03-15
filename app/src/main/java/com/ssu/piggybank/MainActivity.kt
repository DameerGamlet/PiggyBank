package com.ssu.piggybank

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binanceButton: ImageButton = findViewById(R.id.next)
        binanceButton.setOnClickListener {
            val intent = Intent(this, CurrentBalanceActivity::class.java)
            startActivity(intent)
        }
    }
}