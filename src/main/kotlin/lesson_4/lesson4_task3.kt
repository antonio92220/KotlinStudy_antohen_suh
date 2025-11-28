package org.example.lesson_4

fun main() {

    val factName = "Guest"
    val isMatch : Boolean = SUPPOSED_NAME == factName
    println("User match result: $isMatch")

}

const val SUPPOSED_NAME = "Admin"

/*
Задача 3: Валидация данных (Boolean + String Logic)
Сравниваем, совпадает ли полученное имя пользователя с ожидаемым, и выводим отчет.

Создай переменную с ожидаемым именем (строка, например, "Admin").

Создай переменную с фактическим именем (строка, например, "Guest").

Создай булеву переменную isMatch, которая проверяет их на равенство (==).

Выведи строку вида: "User match result: false".*/
