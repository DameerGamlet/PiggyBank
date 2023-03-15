package com.ssu.piggybank.item_service.transfer

import com.ssu.piggybank.R

data class TransferItem(val imageResId: Int, val text: String)

val transferItems = listOf(
    TransferItem(R.drawable.topup, "Topup"),
    TransferItem(R.drawable.send, "Send"),
    TransferItem(R.drawable.payment, "Payment"),
    TransferItem(R.drawable.request, "Request")
)