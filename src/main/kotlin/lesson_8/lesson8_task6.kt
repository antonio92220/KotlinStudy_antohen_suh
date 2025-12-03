package org.example.lesson_8

fun main() {
    val responseTimes = arrayOf(120, 450, 300, 450, 100)

    var maxTime = responseTimes[0]
    var maxIndex = 0

    for (i in responseTimes.indices) {
        if (responseTimes[i] >= maxTime) {
            maxTime = responseTimes[i]
            maxIndex = i
        }
    }

    println("Худший запрос в мс: $maxTime")
    println("Индекс запроса равен: $maxIndex")
}


/*
Задача 5: Поиск самого медленного запроса (Max Value Search)
У тебя есть массив с временем ответа от сервера в миллисекундах. Твоя задача —
найти самый медленный запрос, вывести его время и его порядковый номер (индекс).

Вводные данные:

Создай массив целых чисел responseTimes: arrayOf(120, 450, 300, 450, 100).

Требуемый вывод:

Время самого медленного запроса.

Индекс этого запроса в массиве.*/
