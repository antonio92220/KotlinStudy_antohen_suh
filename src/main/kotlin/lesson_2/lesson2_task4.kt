package org.example.lesson_2

fun main() {
    val numberOfCrystals = 7
    val numberOfIron = 11
    val buffValuePercentage = 20
    val percent = 100
    val buffValueFraction = buffValuePercentage / percent

    val crystalsGrowthAfterBuff = numberOfCrystals * buffValueFraction
    val ironGrowthAfterBuff = numberOfIron * buffValueFraction

    println("Количество бонусной кристаллической руды = ${crystalsGrowthAfterBuff.toInt()}")
    println("Количество бонусной железной руды = ${ironGrowthAfterBuff.toInt()}")
}