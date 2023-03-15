package com.ssu.piggybank

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.R.drawable.ic_arrow_back_black_24
import com.ssu.piggybank.item_service.binance.BinanceAdapter
import com.ssu.piggybank.item_service.binance.binanceItem
import com.ssu.piggybank.item_service.transfer.TransferAdapter
import com.ssu.piggybank.item_service.transfer.transferItems

class CurrentBalanceActivity : AppCompatActivity() {

    @SuppressLint("PrivateResource")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_balance)

        supportActionBar?.apply {
            title = "Current balance"
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(ic_arrow_back_black_24)
        }

        val shortTransfer = transferItems.take(4)
        val shortBinance = binanceItem.take(4)

        val transferRecyclerView: RecyclerView = findViewById(R.id.transfer_view)
        transferRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        transferRecyclerView.adapter = TransferAdapter(shortTransfer)

        val binanceRecyclerView: RecyclerView = findViewById(R.id.binance_item_recycle)
        binanceRecyclerView.layoutManager = LinearLayoutManager(this)
        binanceRecyclerView.adapter = BinanceAdapter(shortBinance)

        val textViewViewAll = findViewById<TextView>(R.id.text_view_view_all)
        textViewViewAll.setOnClickListener {
            val intent = Intent(this, BinanceViewAll::class.java)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}