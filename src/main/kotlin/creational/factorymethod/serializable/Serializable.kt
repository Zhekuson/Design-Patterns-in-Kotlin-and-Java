package main.kotlin.creational.factorymethod.serializable

interface Serializable {
    val serializedInstance:String
    fun printOut(){
        println(serializedInstance)
    }
}