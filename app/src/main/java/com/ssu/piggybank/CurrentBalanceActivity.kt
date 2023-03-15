package com.ssu.piggybank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ssu.piggybank.item_service.BinanceItem
import com.ssu.piggybank.item_service.binanceItem
import com.ssu.piggybank.item_service.BinanceItemAdapter

class CurrentBalanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_balance)

        val shortBinance = binanceItem.take(4)

        val recyclerView: RecyclerView = findViewById(R.id.binance_item_recycle)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BinanceItemAdapter(shortBinance)

        val textViewViewAll = findViewById<TextView>(R.id.text_view_view_all)
        textViewViewAll.setOnClickListener {
            val intent = Intent(this, BinanceViewAll::class.java)
            startActivity(intent)
        }
    }
}