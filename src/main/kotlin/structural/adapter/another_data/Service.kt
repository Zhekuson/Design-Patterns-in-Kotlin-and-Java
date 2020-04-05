package main.kotlin.structural.adapter.another_data

class Service {
    fun getData(): AnotherData {
        return XMLData()
    }

}