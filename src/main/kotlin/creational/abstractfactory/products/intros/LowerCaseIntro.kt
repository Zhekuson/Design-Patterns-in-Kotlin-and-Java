package main.kotlin.creational.abstractfactory.products.intros

class LowerCaseIntro(private var str:String):Intro {
    override fun printOut() {
        println("LowerCase intro")
        println(str)
    }
}