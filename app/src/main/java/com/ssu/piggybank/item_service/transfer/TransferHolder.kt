package com.ssu.piggybank.item_service.transfer

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ssu.piggybank.R

class TransferHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val transferImage: ImageView = itemView.findViewById(R.id.image_transfer)
    private val transferText: TextView = itemView.findViewById(R.id.text_transfer)

    fun bind(transfer: TransferItem) {
        transferImage.setImageResource(transfer.imageResId)
        transferText.text = transfer.text
    }
}