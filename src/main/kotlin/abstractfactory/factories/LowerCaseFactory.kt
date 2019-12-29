package main.kotlin.abstractfactory.factories

import main.kotlin.abstractfactory.products.endings.Ending
import main.kotlin.abstractfactory.products.endings.LowerCaseEnding
import main.kotlin.abstractfactory.products.intros.Intro
import main.kotlin.abstractfactory.products.intros.LowerCaseIntro

class LowerCaseFactory:CaseFactory {
    override fun createIntro(input: String): Intro {
        var result:String =""
        for (s in input){
            if (s.isLowerCase()){
                result +=s
            }
        }
        return LowerCaseIntro(result)
    }

    override fun createEnding(input: String): Ending {
        var result:String =""
        var counter:Int = 0
        for (s in input){
            if (s.isLowerCase()){
                result +=s
            }
            counter++
        }
        return LowerCaseEnding(result,counter)
    }
}