package com.ssu.piggybank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ssu.piggybank.item_service.BinanceItem
import com.ssu.piggybank.item_service.BinanceItemAdapter
import com.ssu.piggybank.item_service.binanceItem

class BinanceViewAll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binance_view_all)

        val recyclerView: RecyclerView = findViewById(R.id.binance_item_recycle)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BinanceItemAdapter(binanceItem)
    }
}