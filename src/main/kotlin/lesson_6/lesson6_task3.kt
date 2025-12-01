package org.example.lesson_6

fun main() {
    var counter = 5
    while (counter > 0) {
        println("Текущее число ${counter--}")
        Thread.sleep(1000)
    }
}

/*
Задача 3: Временное ожидание (Задержка)
Реализуй вывод чисел от 5 до 1. Каждое число должно выводиться с паузой в одну секунду относительно предыдущего.*/
