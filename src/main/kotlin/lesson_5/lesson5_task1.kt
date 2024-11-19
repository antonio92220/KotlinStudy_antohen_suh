package org.example.lesson_5

const val ANSWER = 7

fun main() {
    println("Привет!Введи, сколько будет 5+2=?")
    val userAnswer = readln()!!.toInt()

    if (userAnswer == ANSWER) {
        println("Добро пожаловать!")

    } else {
        println("доступ запрещен")

    }
}