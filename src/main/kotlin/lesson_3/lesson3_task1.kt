package org.example.lesson_3
import java.time.LocalTime

fun main() {
    /*
    При входе в приложение высвечивается приветствие. Представим, что мы пишем функцию,
    которая будет выводить приветствие с именем пользователя на экран (в нашем случае в консоль).
    Tекст приветствия может меняться в зависимости от времени суток.
    Так, например, выводится приветствие при входе в приложение Сбербанка.

Приветствие и имя пользователя должны храниться в отдельных переменных.
Вывести в консоль два приветствия (для дня и для вечера), перезаписывая данные в одну исходную переменную.
     */
    val userName = "Браток"
    val currentTime = LocalTime.now()
    val morningTimeStart = LocalTime.of(6, 0)
    val eveningTimeStart = LocalTime.of(18, 0)

    if (currentTime.isAfter(morningTimeStart) && currentTime.isBefore(eveningTimeStart))
    {
        println("Добрый день,$userName")
    }
    else {
        println("Добрый вечер,$userName")
    }
}