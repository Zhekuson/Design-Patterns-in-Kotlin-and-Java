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
    print(provider1.getInstance())
    print(provider2.getInstance())
}