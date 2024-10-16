package org.example.lesson_2

fun main() {

    val depositAmount = 70000
    val annualInterestRatePercent = 16.7
    val depositPeriodInYears = 20
    val finalDepositAmount =
        depositAmount * Math.pow((1 + annualInterestRatePercent / 100), depositPeriodInYears.toDouble())
    println((String.format("%.3f", finalDepositAmount)))


}
