package main.kotlin.singleton

public object KeyWordProvider{
    private lateinit var keyWord:String
    init {
        print("Initialization")
        keyWord = "HHGDKFSSAS"
    }
    fun getInstance(): KeyWordProvider = apply {
        return this;
    }
}

fun main() {
    val provider1 =  KeyWordProvider
    val provider2 = KeyWordProvider
    println(provider1.getInstance())
    println(provider2.getInstance())
}