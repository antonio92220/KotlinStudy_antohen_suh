package org.example.lesson_4

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_AMOUNT_MAX = 100

fun main() {
    val weightFirst = 20
    val amountFirst = 80
    val weightSecond = 50
    val amountSecond = 100

    println("Груз с весом $weightFirst кг и объемом $amountFirst л соответствует категории 'Average': " +
            "${(weightFirst > AVERAGE_WEIGHT_MIN && weightFirst <= AVERAGE_WEIGHT_MAX) && amountFirst < AVERAGE_AMOUNT_MAX}")
    println("Груз с весом $weightSecond кг и объемом $amountSecond л соответствует категории 'Average': " +
            "${(weightSecond > AVERAGE_WEIGHT_MIN && weightSecond <= AVERAGE_WEIGHT_MAX) && amountSecond < AVERAGE_AMOUNT_MAX}")
}


