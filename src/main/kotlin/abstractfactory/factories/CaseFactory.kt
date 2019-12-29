package main.kotlin.abstractfactory.factories

import main.kotlin.abstractfactory.products.endings.Ending
import main.kotlin.abstractfactory.products.intros.Intro

interface CaseFactory {
    fun createIntro(input: String): Intro
    fun createEnding(input: String): Ending
}