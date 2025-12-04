package org.example.lesson_9

fun main() {
    val codeList = mutableListOf(200, 404, 403, 200, 500)

    if (codeList.contains(500)) {
        println("Индекс кода 500 в списке - ${codeList.indexOf(500)}")
    } else println("Critical error not found")

}

/*
Задача 3: Поиск элемента
Дан список кодов ответов: 200, 404, 500, 403, 200. Напиши код, который проверяет, есть ли в списке число 500.

Если есть — выведи его порядковый номер (индекс) в списке.

Если нет — выведи сообщение "Critical error not found".*/
