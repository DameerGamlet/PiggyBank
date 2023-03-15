package com.ssu.piggybank.item_service

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ssu.piggybank.R

class BinanceHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val icon: ImageView = itemView.findViewById(R.id.binance_image)
    val name: TextView = itemView.findViewById(R.id.binance_name)
    val date: TextView = itemView.findViewById(R.id.binance_date)
    val amount: TextView = itemView.findViewById(R.id.binance_amount)
}