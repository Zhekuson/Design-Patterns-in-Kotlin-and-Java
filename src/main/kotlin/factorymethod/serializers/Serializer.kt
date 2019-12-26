package main.kotlin.factorymethod.serializers

import main.kotlin.factorymethod.serializable.Serializable

public abstract class Serializer {
    public abstract fun serialize(instance:Any):Serializable
}