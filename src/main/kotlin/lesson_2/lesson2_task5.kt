package org.example.lesson_2

fun main() {
    val timeSeconds: Int = 2
    val correction: Double = 0.5
    val factor: Float = 10.0f
    val result = (timeSeconds + correction) * factor

    println("Индекс стабильности = $result")
    println("Тип данных: ${result::class.simpleName}")
    println("Система медленная? ${result > 20}")


}
/*
Задача 5: Сложная (Mixed Types & Logic)
Рассчитываем "Индекс стабильности". Тут смешаем всё: разные типы данных, приоритет операций и сравнение.

Дано:

val timeSeconds = 2 (время отклика, Int)

val correction = 0.5 (коэффициент, Double)

val factor = 10.0f (множитель, Float — не забудь f)

Формула индекса: (timeSeconds + correction) * factor.

Обрати внимание на скобки! Без них результат будет другим.

Запиши результат в переменную result.

Выведи сам результат.

Выведи тип этой переменной (в видео показывали ::class.simpleName).

Проверь, является ли система "Медленной". Система медленная, если result > 20. Выведи результат этого сравнения (true или false).*/
