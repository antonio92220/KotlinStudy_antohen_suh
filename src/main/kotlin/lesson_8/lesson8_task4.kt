package org.example.lesson_8

fun main() {
    val requests = arrayOf(50, 60, 40, 70, 50)
    var totalRequests = 0
    for (i in requests) {
        totalRequests += i
    }
    println("Total requests:$totalRequests")
}


/*
Задача 4: Расчет нагрузки (Arithmetic in Loop)
Посчитаем общее количество запросов.

Создай массив целых чисел requests, имитирующий количество запросов за 5 секунд (например: 50, 60, 40, 70, 50).

Создай переменную totalRequests равную 0.

Используя цикл for, пройдись по массиву и прибавь каждый элемент к переменной totalRequests.

После цикла выведи общую сумму: "Total requests: [сумма]".*/
