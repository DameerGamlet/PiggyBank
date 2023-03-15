package com.ssu.piggybank.item_service

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ssu.piggybank.CurrentBalanceActivity
import com.ssu.piggybank.R
import com.ssu.piggybank.item_service.BinanceItem;

class BinanceItemAdapter(private val items: List<CurrentBalanceActivity.BinanceItem>) :
    RecyclerView.Adapter<BinanceHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BinanceHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.binance_item, parent, false)
        return BinanceHolder(view)
    }

    override fun onBindViewHolder(holder: BinanceHolder, position: Int) {
        val currentItem = items[position]

        holder.icon.setImageResource(currentItem.imageResource)
        holder.name.text = currentItem.name
        holder.date.text = currentItem.date
        holder.amount.text = currentItem.amount
    }

    override fun getItemCount() = items.size
}

