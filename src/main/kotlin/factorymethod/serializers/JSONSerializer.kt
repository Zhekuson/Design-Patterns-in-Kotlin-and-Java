package main.kotlin.factorymethod.serializers

import main.kotlin.factorymethod.serializable.JSONSerializable
import main.kotlin.factorymethod.serializable.Serializable

class JSONSerializer():Serializer() {
    override fun serialize(instance:Any): Serializable {
        return JSONSerializable("JSON\":"+instance+"\":JSON")
    }
}