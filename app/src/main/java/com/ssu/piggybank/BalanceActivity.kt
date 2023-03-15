package com.ssu.piggybank

import android.R.id
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class BalanceActivity : AppCompatActivity() {
    private val listView: ListView = findViewById(R.id.listView)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balance)


        val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")

        val adapter = ArrayAdapter(
            applicationContext,
            android.R.layout.simple_list_item_1, items
        )

        listView.adapter = adapter
    }
}