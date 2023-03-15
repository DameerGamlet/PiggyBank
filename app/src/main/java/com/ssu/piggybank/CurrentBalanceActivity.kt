package com.ssu.piggybank

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.R.drawable.ic_arrow_back_black_24
import com.ssu.piggybank.databinding.ActivityCurrentBalanceBinding
import com.ssu.piggybank.item_service.GlobalItems.binanceItem
import com.ssu.piggybank.item_service.GlobalItems.transferItems
import com.ssu.piggybank.item_service.binance.BinanceAdapter
import com.ssu.piggybank.item_service.transfer.TransferAdapter

class CurrentBalanceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCurrentBalanceBinding

    @SuppressLint("PrivateResource")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCurrentBalanceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.apply {
            title = "Current balance"
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(ic_arrow_back_black_24)
        }

        val shortTransfer = transferItems.take(4)
        val shortBinance = binanceItem.take(4)

        binding.transferView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = TransferAdapter(shortTransfer)
        }

        binding.binanceItemRecycle.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = BinanceAdapter(shortBinance)
        }

        binding.textViewViewAll.setOnClickListener {
            val intent = Intent(this, BinanceViewAll::class.java)
            startActivity(intent)
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