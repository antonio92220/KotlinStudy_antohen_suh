package lesson_20

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numbers.filter { it % 2 == 0 }.map { it / 2 }
    println(evenNumbers)
}


/*
Твоя задача (Коллекции + Лямбда):
В функции main создай список чисел от 1 до 10: val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

Используй функцию .filter { ... }, чтобы создать новый список evenNumbers, в котором останутся только четные числа.

Выведи результат в консоль.*/
