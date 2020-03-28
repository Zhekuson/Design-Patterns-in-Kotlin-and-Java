package main.kotlin.creational.abstractfactory.products.endings

class UpperCaseEnding(private var str:String, private var counter:Int):Ending {
    override fun printOut() {
        println("UpperCase ending")
        println("$str counter all: $counter")
    }
}