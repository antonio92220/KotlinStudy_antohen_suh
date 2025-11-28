package org.example.lesson_4

fun main() {
    val actualVersionApp = 40
    val minimumVersionApp = 42
    val isUpdateNeeded: Boolean = actualVersionApp < minimumVersionApp
    println("Update needed: $isUpdateNeeded")

}

/*
Задача 1: Сравнение версий (Boolean + String Template)
Нужно вывести красивый лог сравнения версий приложения.

Создай переменную с актуальной версией приложения (целое число, например, 40).

Создай переменную с минимально требуемой версией для работы (целое число, например, 42).

Создай булеву переменную isUpdateNeeded, которая будет true, если актуальная версия меньше требуемой.

Выведи в консоль фразу: "Update needed: [твоя булева переменная]" (используй интерполяцию).*/
