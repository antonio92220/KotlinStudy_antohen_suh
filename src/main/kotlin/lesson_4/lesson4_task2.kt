package org.example.lesson_4

fun main() {
    val numberOfTests = 10
    val timeForOneTestInSec = 4
    val limitIsOver: Boolean = (numberOfTests * timeForOneTestInSec) > LIMIT_FOR_ALL_TESTS_IN_SEC

    println("Лимит превышен? - $limitIsOver")

}

const val LIMIT_FOR_ALL_TESTS_IN_SEC = 35
/*Задача 2: Бюджет теста (Boolean + Arithmetic)
Проверяем, укладывается ли выполнение набора тестов в выделенный временной бюджет.

Есть количество тестов (целое число, например, 10).

Есть время выполнения одного теста в секундах (целое число, например, 4).

Есть общий лимит времени на все тесты (целое число, например, 35 секунд).

Создай булеву переменную. Она должна быть true, если общее время (количество * время одного) превышает лимит.

Выведи результат.*/
