package org.example.lesson_5

/*Изменить пример из видео урока. В уроке создавался блок кода, считывающий возраст. И если
возраст больше или равен 18 лет, показывали экран со скрытым контентом (выводили это сообщение.
в консоль в качестве имитации).
Новое условие:
- Пользователь должен вводить не возраст, а год рождения;
- Возраст пользователя высчитывать на основании текущего года;
- Вычисляемый результат должен сравниваться с константой, в которой хранится возраст
совершеннолетия (18);
- Если год рождения подходит, выводить сообщение "Показать экран со скрытым контентом".*/

fun main() {
    val yearOfBirth = readln()!!.toInt()
    val age = 2023 - yearOfBirth
    if (age >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else println("Показать экран с ограниченным контентом")


}
const val AGE_OF_MAJORITY = 18