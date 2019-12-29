package main.kotlin.abstractfactory.products.endings

class LowerCaseEnding(private var str:String, private var counter:Int):Ending {
    override fun printOut() {
        println("LowerCase ending")
        println("$str counter all: $counter")
    }
}