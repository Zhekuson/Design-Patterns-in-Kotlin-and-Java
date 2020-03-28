package main.kotlin.creational.abstractfactory.products.intros

class UpperCaseIntro(private var str:String):Intro {
    override fun printOut() {
        println("UpperCase intro")
        println(str)
    }
}