package com.ssu.piggybank

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.R.drawable.ic_arrow_back_black_24
import com.ssu.piggybank.item_service.binance.BinanceAdapter
import com.ssu.piggybank.item_service.binance.binanceItem

class BinanceViewAll : AppCompatActivity() {
    @SuppressLint("PrivateResource")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binance_view_all)

        supportActionBar?.apply {
            title = "My finance"
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(ic_arrow_back_black_24)
        }

        val recyclerView: RecyclerView = findViewById(R.id.binance_item_recycle)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BinanceAdapter(binanceItem)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}