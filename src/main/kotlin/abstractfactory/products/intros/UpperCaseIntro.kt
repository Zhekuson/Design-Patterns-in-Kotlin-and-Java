package main.kotlin.abstractfactory.products.intros

class UpperCaseIntro(private var str:String):Intro {
    override fun printOut() {
        println("UpperCase intro")
        println(str)
    }
}