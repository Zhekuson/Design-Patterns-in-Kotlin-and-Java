package main.kotlin.creational.abstractfactory

import main.kotlin.creational.abstractfactory.factories.CaseFactory
import main.kotlin.creational.abstractfactory.factories.LowerCaseFactory
import main.kotlin.creational.abstractfactory.factories.UpperCaseFactory

fun getFactory(char: Char):CaseFactory{
    when(char){
        'L'->return LowerCaseFactory()
        'U'->return UpperCaseFactory()
        else->return UpperCaseFactory()
    }
}
fun printEnding(factory: CaseFactory, endingSample: String){
    factory.createEnding(endingSample).printOut()
}
fun printIntro(factory: CaseFactory, introSample:String){
    factory.createIntro(introSample).printOut()
}
fun makeStoryScreen(factory: CaseFactory){
    val dit = "bla bla bla\n bla bla bla \n bla bla bla"
    printIntro(factory, introSample)
    println(dit)
    printEnding(factory, endingSample)
}
const val introSample = "vervecsoAJMVEKLNAKLNDVs,vlmdvmKLSfm;lMF"
const val endingSample = ",dev:LVM:al:KVlmALMA:S:l,ca,slvn:SM;lcvs;"
fun main() {
    var factory: CaseFactory = getFactory('L')
    makeStoryScreen(factory)
    println("*************************************************8")
    factory = getFactory('U')
    makeStoryScreen(factory)
}