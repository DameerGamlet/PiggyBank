package com.ssu.piggybank.item_service.transfer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ssu.piggybank.R


class TransferAdapter(private val transfers: List<TransferItem>) : RecyclerView.Adapter<TransferHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransferHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.transfer_item, parent, false)
        return TransferHolder(view)
    }

    override fun onBindViewHolder(holder: TransferHolder, position: Int) {
        holder.bind(transfers[position])
    }

    override fun getItemCount(): Int {
        return transfers.size
    }
}
