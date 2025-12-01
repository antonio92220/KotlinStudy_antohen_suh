package org.example.lesson_5

fun main() {
    val nameOfEnvironment = readln()
    when(nameOfEnvironment)
    {
        "QA" -> println("http://qa-server.com")
        "DEV" -> println("http://dev-server.com")
        "PROD" -> println("http://prod-server.com")
        else -> println("Invalid environment")
    }
}

/*
Используй конструкцию when для выбора URL в зависимости от названия среды.
Создай переменную с названием окружения (например, "DEV", "QA" или "PROD").
С помощью when проверь значение этой переменной:
Для "QA" — выведи "http://qa-server.com".
Для "DEV" — выведи "http://dev-server.com".
Для "PROD" — выведи "http://prod-server.com".
Для любого другого значения — выведи "Invalid environment".*/
