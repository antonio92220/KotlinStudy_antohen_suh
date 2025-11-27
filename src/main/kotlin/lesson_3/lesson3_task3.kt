package org.example.lesson_3

fun main() {
    val requestsPerSecond = 150
    val testDurationSeconds = 60
    val totalRequestsReport = "Total requests sent during the load test: ${requestsPerSecond * testDurationSeconds}"

    println(totalRequestsReport)
}

/*
Задача 3: Выражения в шаблонах
Создай переменную, которая содержит результат вычисления, встроенный в строку.
Создай переменную requestsPerSecond со значением 150.
Создай переменную testDurationSeconds со значением 60.
Создай строку totalRequestsReport, которая выводит текст: "Total requests sent during the load test: [результат]"
Внимание: Вместо [результат] должно быть встроено выражение, которое вычисляет общее количество запросов,
умножая requestsPerSecond на testDurationSeconds.
Выведи totalRequestsReport.*/
