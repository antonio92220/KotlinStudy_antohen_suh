package org.example.lesson_5

fun main() {
    val codeOfError = readln().toInt()
    val message = when (codeOfError) {
        404 -> "Resource not found"
        200 -> "Successful request"
        500 -> "Internal server error"
        else -> "Unknown error code"
    }
    println("Server response: $message")

}

/*

Объедини ввод данных, преобразование типов и when как выражение.
Считай с консоли код ошибки (вводится число).
Создай переменную message, в которую запиши результат работы when по введенному коду:
Код 404 -> строка "Resource not found".
Код 200 -> строка "Successful request".
Код 500 -> строка "Internal server error".
Любой другой код -> строка "Unknown error code".
Выведи итоговое сообщение в формате: "Server response: [твое сообщение]".*/
