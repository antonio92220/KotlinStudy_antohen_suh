package org.example.lesson_2

fun main() {
    val requests = 23
    val servers = 5
    val extraRequest = requests % servers


    println("Лишними останутся $extraRequest запросов")
}

/*
Задача 3: Остаток от деления (Load Balancer)
Распределяем нагрузку.

Есть 23 входящих запроса (requests).

У нас есть 5 серверов (servers).

Мы распределяем запросы поровну. Сколько запросов останется "лишними" (не влезут в равное распределение)?

Используй оператор остатка от деления % и выведи это число.*/
