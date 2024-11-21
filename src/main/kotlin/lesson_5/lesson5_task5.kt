package org.example.lesson_5

import kotlin.random.Random


/*Для алгоритма улучшенного приложения-лотереи нужно угадать три числа от 0 до 42. Пользователь
вводит числа через консоль.
Требования к программе:
- Загаданные числа должны рандомно генерироваться при каждом запуске программы и храниться в списке
- Поочередно введенные пользователем числа должны также храниться в списке.
- Для определения совпадений используй метод intersect() и сохрани размер полученной коллекции
в отдельную переменную.
В зависимости от количества угаданных чисел программа выводит результат:
- При трех совпадениях сообщается, что пользователь угадал все числа и выиграл джекпот.
- При двух совладениях информируется о том, что пользователь угадал два числа и получает
крупный приз.
- Если угадано одно число, пользователю выплачивается утешительный приз.
- Если нет совпадений, программа сообщает, что пользователь не угадал ни одного числа.
- В конце игры вне зависимости от результата программа выводит выигрышные числа.*/

val NUMBERS = List(3) { (Random.nextInt(0, 42)) }
fun main() {
    val userNumbersList: MutableList<Int> = mutableListOf()
    println("Введите первое число")
    val numberOne = readln()!!.toInt()
    println("Введите второе число")
    val numberTwo = readln()!!.toInt()
    println("Введите третье число")
    val numberThree = readln()!!.toInt()

    userNumbersList.add(numberOne)
    userNumbersList.add(numberTwo)
    userNumbersList.add(numberThree)

    if (userNumbersList.intersect(NUMBERS).size == 3) {
        println("Поздравляем, вы выиграли джекпот")
    } else if (userNumbersList.intersect(NUMBERS).size == 2) {
        println("Вы выиграли крупный приз")
    } else if (userNumbersList.intersect(NUMBERS).size == 1) {
        println("Вы выиграли утешительный приз")
    } else if (userNumbersList.intersect(NUMBERS).size == 0) {
        println("Вы не угадали ни одного числа")
    }

}