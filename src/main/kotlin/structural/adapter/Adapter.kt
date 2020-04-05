package main.kotlin.structural.adapter

import main.kotlin.structural.adapter.another_data.Service
import main.kotlin.structural.adapter.some_data.Data
import main.kotlin.structural.adapter.some_data.DataProvider
import main.kotlin.structural.adapter.some_data.JSONData

class Adapter:DataProvider {
    var service = Service()
    private fun getTransformedData():Data{
        var value = service.getData()
        return JSONData(value.toString())
    }

    override fun getData(): Data {
        return getTransformedData()
    }

}