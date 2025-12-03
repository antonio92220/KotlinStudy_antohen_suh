package org.example.lesson_8

fun main() {
    val suiteNames = arrayOf("Login", "Registration", "Cart", "Checkout")

    for (i in suiteNames) {
        println("Test suite: $i ")
    }
}


/*
Задача 3: Красивый список (Loop & Output)
Нужно вывести список тестовых сьютов для отчета.

Создай массив строк suiteNames (например, "Login", "Registration", "Cart", "Checkout").

Используя цикл for, пройдись по всему массиву.

На каждой итерации выводи строку вида: "Test suite: [имя]".*/
