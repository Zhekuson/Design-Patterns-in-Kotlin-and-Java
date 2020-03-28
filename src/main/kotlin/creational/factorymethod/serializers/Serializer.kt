package main.kotlin.creational.factorymethod.serializers

import main.kotlin.creational.factorymethod.serializable.Serializable

public abstract class Serializer {
    public abstract fun serialize(instance:Any):Serializable
}