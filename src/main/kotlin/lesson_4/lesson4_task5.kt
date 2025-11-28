package org.example.lesson_4

fun main() {
    val statusServer = true
    val currentOccupiedMemoryInMb = 800
    val currentMemoryOccupiedInPercent = currentOccupiedMemoryInMb / SIZE_OF_MEMORY_IN_MB * 100
    val alertForServer =
        (statusServer == true) && (currentMemoryOccupiedInPercent > MAX_MEMORY_OCCUPIED_IN_PERCENT)
    println(
        """
    Server Check:
    Status Online: $statusServer
    Memory Usage Critical: $alertForServer
""".trimIndent()
    )
}

const val SIZE_OF_MEMORY_IN_MB: Double = 1024.0
const val MAX_MEMORY_OCCUPIED_IN_PERCENT = 80


/*
Задача 5: Мониторинг сервера (Complex: Math + Boolean + Multiline String)
Самая сложная. Нужно рассчитать нагрузку и принять решение об алерте.

Вводные:

Всего памяти на сервере: 1024 (Мб).

Занято памяти: 800 (Мб).

Доступность сервера: true (Сервер включен).

Логика алерта (тревоги): Тревога (isCritical) должна сработать (true), если:

Сервер включен.

И процент занятой памяти больше 80% (тебе нужно внутри логического выражения вычислить процент: (занято / всего) * 100). Внимание на типы данных при делении!

Вывод: Используй многострочный текст (""") с .trimIndent(), чтобы вывести отчет такого вида:

Plaintext

Server Check:
Status Online: true
Memory Usage Critical: [результат твоего вычисления]*/
