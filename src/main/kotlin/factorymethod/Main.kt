package main.kotlin.factorymethod

import main.kotlin.factorymethod.serializers.JSONSerializer
import main.kotlin.factorymethod.serializers.Serializer
import main.kotlin.factorymethod.serializers.XMLSerializer

fun main() {
    val jsonSerializer: Serializer = JSONSerializer()
    val xmlSerializer: Serializer = XMLSerializer()
    val serializers = ArrayList<Serializer>(listOf(jsonSerializer,xmlSerializer))
    for (serializer in serializers){
        serializer.serialize("SOME INSTANCE").printOut()
    }
}