package main.kotlin.creational.abstractfactory.factories

import main.kotlin.creational.abstractfactory.products.endings.Ending
import main.kotlin.creational.abstractfactory.products.intros.Intro

interface CaseFactory {
    fun createIntro(input: String): Intro
    fun createEnding(input: String): Ending
}