package org.example.lesson_5

fun main() {
    val password = readln()

    if (password.length < RECOMMENDED_LENGTH_OF_PASSWORD) {
        println("Password is too short")
    } else {
        println("Password accepted")
    }
}

const val RECOMMENDED_LENGTH_OF_PASSWORD = 8

/*
Задача 1: Проверка длины пароля (If/Else)
Реализуй базовую валидацию.

Создай строковую переменную для пароля (задай любое значение).

Если длина пароля меньше 8 символов — выведи в консоль "Password is too short".

В противном случае — выведи "Password accepted".*/
