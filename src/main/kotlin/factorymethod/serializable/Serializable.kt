package main.kotlin.factorymethod.serializable

interface Serializable {
    val serializedInstance:String
    fun printOut(){
        println(serializedInstance)
    }
}