package main.kotlin.creational.factorymethod.serializers

import main.kotlin.creational.factorymethod.serializable.Serializable
import main.kotlin.creational.factorymethod.serializable.XMLserializable

class XMLSerializer():Serializer(){
    override fun serialize(instance:Any): Serializable {
        //for simplicity, it makes just a string with <xml>[cause it s a toy example]
        return XMLserializable("<xml> "+instance.toString()+" <xml>")
    }
}