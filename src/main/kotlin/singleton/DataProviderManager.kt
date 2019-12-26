package main.kotlin.singleton

import javax.xml.crypto.Data
import kotlin.random.Random

class DataProvider(private var data: String){
    fun getData():String{
       return data.capitalize();
    }
}

object DataProviderManager {
    private var dataProvider:DataProvider
    init {
        dataProvider = DataProvider("somedata"+ Random.nextInt(100))
    }
    fun getInstance():String{
        return dataProvider.getData()
    }
}

fun main() {
    val provider = DataProviderManager
    println(provider.getInstance())
    val provider2 = DataProviderManager
    println(provider2.getInstance())
}