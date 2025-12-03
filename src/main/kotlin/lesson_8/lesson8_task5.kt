package org.example.lesson_8

fun main() {
    val results = arrayOf("Passed", "Failed", "Passed", "Passed", "Failed")
    var passedCount = 0
    var failedCount = 0
    for (i in results) {
        if (i == "Passed") {
            passedCount++
        } else failedCount++
    }
    println(
        """
        Tests Passed $passedCount
        Tests Failed $failedCount
    """.trimIndent()
    )
}

/*
Задача 5: Статистика тестирования (Counters & Logic)
Самая сложная. Нужно проанализировать результаты прогона тестов.

Создай массив строк results, содержащий статусы тестов: arrayOf("Passed", "Failed", "Passed", "Passed", "Failed").

Создай две переменные-счетчика: passedCount и failedCount, изначально равные 0.

Пройдись циклом по массиву.

Внутри цикла используй проверку if:

Если текущий элемент равен "Passed", увеличивай passedCount на 1.

Если текущий элемент равен "Failed", увеличивай failedCount на 1.

После цикла выведи итоговый отчет:

Plaintext

Tests Passed: [число]
Tests Failed: [число]*/
