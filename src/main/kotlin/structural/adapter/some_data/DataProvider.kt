package main.kotlin.structural.adapter.some_data

import main.kotlin.structural.adapter.some_data.Data

interface DataProvider {
    fun getData(): Data
}