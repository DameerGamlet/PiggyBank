package com.ssu.piggybank.item_service

import com.ssu.piggybank.R
import com.ssu.piggybank.item_service.binance.BinanceItem
import com.ssu.piggybank.item_service.transfer.TransferItem

object GlobalItems {
    val transferItems = listOf(
        TransferItem(R.drawable.topup, "Topup"),
        TransferItem(R.drawable.send, "Send"),
        TransferItem(R.drawable.payment, "Payment"),
        TransferItem(R.drawable.request, "Request")
    )

    val binanceItem = listOf(
        BinanceItem("Amazon", "Sep 3, 2023", "+$340", R.drawable.amazon),
        BinanceItem("Spotify", "Oct 15, 2023", "+$420", R.drawable.shopify),
        BinanceItem("Uber", "Nov 20, 2023", "+$550", R.drawable.uber),
        BinanceItem("Spotify", "Nov 1, 2023", "+$550", R.drawable.spotify),
        BinanceItem("Amazon 2", "Sep 3, 2023", "+$340", R.drawable.amazon),
        BinanceItem("Spotify 2", "Oct 15, 2023", "+$420", R.drawable.shopify),
        BinanceItem("Uber 2", "Nov 20, 2023", "+$550", R.drawable.uber),
        BinanceItem("Spotify 2", "Nov 1, 2023", "+$550", R.drawable.spotify)
    )
}
