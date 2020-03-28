package main.kotlin.creational.abstractfactory.factories

import main.kotlin.creational.abstractfactory.products.endings.Ending
import main.kotlin.creational.abstractfactory.products.endings.UpperCaseEnding
import main.kotlin.creational.abstractfactory.products.intros.Intro
import main.kotlin.creational.abstractfactory.products.intros.UpperCaseIntro

class UpperCaseFactory:CaseFactory {
    override fun createIntro(input: String): Intro {
        var result:String =""
        for (s in input){
            if (s.isUpperCase()){
                result +=s
            }
        }
        return UpperCaseIntro(result)
    }

    override fun createEnding(input: String): Ending {
        var result:String =""
        var counter:Int = 0
        for (s in input){
            if (s.isUpperCase()){
                result +=s
                counter++
            }
        }
        return UpperCaseEnding(result,counter)
    }
}