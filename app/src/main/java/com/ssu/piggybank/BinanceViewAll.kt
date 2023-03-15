package com.ssu.piggybank

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.R.drawable.ic_arrow_back_black_24
import com.ssu.piggybank.databinding.ActivityBinanceViewAllBinding
import com.ssu.piggybank.item_service.GlobalItems.binanceItem
import com.ssu.piggybank.item_service.binance.BinanceAdapter

class BinanceViewAll : AppCompatActivity() {

    private lateinit var binding: ActivityBinanceViewAllBinding

    @SuppressLint("PrivateResource")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBinanceViewAllBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.apply {
            title = "My finance"
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(ic_arrow_back_black_24)
        }

        binding.binanceItemRecycle.apply {
            layoutManager = LinearLayoutManager(this@BinanceViewAll)
            adapter = BinanceAdapter(binanceItem)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressedDispatcher.onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}