package lesson_13

fun main() {
    val nullPeremennaya1: Int? = null
    val nullPeremennaya2: Int = nullPeremennaya1 ?: 0

    println("nullPeremennaya2 = $nullPeremennaya2")

}

/*
Задача 2: Значение по умолчанию
У тебя есть переменная типа Int?, инициализированная значением null. Создай вторую переменную строгого типа Int
(не null). Требование: Присвой значение из первой переменной во вторую так, чтобы в случае null в первой переменной,
вторая автоматически получила значение 0. Выведи результат.*/
