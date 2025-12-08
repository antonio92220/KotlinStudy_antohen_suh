package org.example.lesson_10

fun main() {
    val identifierReturned = systemIdentification()
    val status = systemStatus()

    println("Отчет по тесту $identifierReturned: $status")
}


fun systemIdentification(): String? {
    val identifier = readln()
    return identifier

}

fun systemStatus(): String? {
    val status = readln()
    return status

}

/*
Задача 2: Формирование отчета
Создай блок кода, который принимает два значения: идентификатор теста (строка) и статус завершения (строка).
Задача блока — вывести в консоль отформатированное сообщение об итогах прогона теста. Пример вывода:
Отчет по тесту [Идентификатор]: [Статус]. Вызови этот блок из main, передав ему любые тестовые данные.*/
