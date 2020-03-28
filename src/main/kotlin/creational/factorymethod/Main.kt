package main.kotlin.creational.factorymethod

import main.kotlin.creational.factorymethod.serializers.JSONSerializer
import main.kotlin.creational.factorymethod.serializers.Serializer
import main.kotlin.creational.factorymethod.serializers.XMLSerializer

fun main() {
    val jsonSerializer: Serializer = JSONSerializer()
    val xmlSerializer: Serializer = XMLSerializer()
    val serializers = ArrayList<Serializer>(listOf(jsonSerializer,xmlSerializer))
    for (serializer in serializers){
        serializer.serialize("SOME INSTANCE").printOut()
    }
}