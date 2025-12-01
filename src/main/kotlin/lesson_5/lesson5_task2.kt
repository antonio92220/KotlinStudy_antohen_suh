package org.example.lesson_5

fun main() {
    val logLevel = readln()
    if (logLevel == ERROR_LOG) {
        println("Critical issue found!")
    } else if (logLevel == WARN_LOG) {
        println("Potential problem")
    } else if (logLevel == INFO_LOG) {
        println("System working normally")
    } else println("Unknown log level")
}

const val ERROR_LOG = "ERROR"
const val WARN_LOG = "WARN"
const val INFO_LOG = "INFO"

/*
Нужно определить уровень важности сообщения лога.

Создай переменную для уровня лога (строка). Возможные значения: "ERROR", "WARN", "INFO".

Напиши конструкцию, которая:

Если уровень "ERROR" — выводит красную тревогу: "Critical issue found!".

Если уровень "WARN" — выводит предупреждение: "Potential problem".

Если уровень "INFO" — выводит: "System working normally".

Во всех остальных случаях — выводит: "Unknown log level".*/
