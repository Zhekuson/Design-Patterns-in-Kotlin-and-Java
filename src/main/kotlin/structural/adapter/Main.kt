package main.kotlin.structural.adapter

import main.kotlin.structural.adapter.some_data.DataProvider

fun main(){
    var provider:DataProvider = Adapter()
    provider.getData()
}