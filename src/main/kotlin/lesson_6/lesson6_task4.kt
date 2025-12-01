package org.example.lesson_6

fun main() {
    val speed = readln().toInt()
    var totalIterations = 0
    if (speed < DEFAULT_NUMBER_OF_ITERATIONS) {
        while (totalIterations < DEFAULT_NUMBER_OF_ITERATIONS) {
            println("Итерация № ${++totalIterations}")
        }
    } else {
        totalIterations = DEFAULT_NUMBER_OF_ITERATIONS * 2
        while (totalIterations > 0) {
            println("Итерация № ${totalIterations--}")
        }
    }
}

const val DEFAULT_NUMBER_OF_ITERATIONS = 5
/*
Базовое количество необходимых итераций равно 5. Однако, если входной параметр "Скорость" (число) превышает 5, это
количество итераций должно быть удвоено. Выполни полученное количество итераций. На каждой итерации выводи ее номер.*/
