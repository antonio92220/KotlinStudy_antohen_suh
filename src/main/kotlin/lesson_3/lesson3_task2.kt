package org.example.lesson_3

fun main() {

    val userId = 12345
    val statusCode = 401
    val longMessage = "User with ID $userId failed authentication with status $statusCode"

    println(longMessage)

}

/*
Задача 2: Шаблонная строка (Интерполяция)
Создай текстовое сообщение для лога, используя строковые шаблоны.
Создай переменную userId со значением 12345.
Создай переменную statusCode со значением 401.
Создай строку logMessage так, чтобы она выглядела как: "User with ID 12345 failed authentication with status 401."
(Используй переменные внутри строки).
Выведи logMessage.*/
