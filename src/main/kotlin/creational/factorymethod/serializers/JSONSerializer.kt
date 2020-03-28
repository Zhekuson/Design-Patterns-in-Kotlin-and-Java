package main.kotlin.creational.factorymethod.serializers

import main.kotlin.creational.factorymethod.serializable.JSONSerializable
import main.kotlin.creational.factorymethod.serializable.Serializable

class JSONSerializer():Serializer() {
    override fun serialize(instance:Any): Serializable {
        return JSONSerializable("JSON\":"+instance+"\":JSON")
    }
}