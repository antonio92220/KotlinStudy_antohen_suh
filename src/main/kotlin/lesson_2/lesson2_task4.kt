package org.example.lesson_2

fun main() {
    val numberOfCrystals = 7
    val numberOfIron = 11
    val buffValue = 0.2

    val crystalsGrowthAfterBuff = numberOfCrystals * buffValue
    val ironGrowthAfterBuff = numberOfIron * buffValue

    println("Количество бонусной кристаллической руды = ${crystalsGrowthAfterBuff.toInt()}")
    println("Количество бонусной железной руды = ${ironGrowthAfterBuff.toInt()}")
}