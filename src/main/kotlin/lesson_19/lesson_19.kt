package lesson_19

import lesson_19.Status.*
import org.example.lesson_5.ERROR_LOG

fun main () {
    // дни недели
    // цвета
    // статусы

    val statusFromServer = listOf(101, 102, 103)

    for (i in statusFromServer) {
        when (i)
        {
            101 -> setStatus(Status.NEW)
            102 -> setStatus(Status.COOKING)
            103 -> setStatus(Status.COMPLETED)
            else -> setStatus(Status.ERROR)
        }
        Thread.sleep(1000)
    }
}

enum class Status {
    NEW,
    COOKING,
    COMPLETED,
    ERROR,
}

fun setStatus (status: Status) {
    when (status) {
        NEW -> println("Заказ принят")
        COOKING -> println("Заказ готовится")
        COMPLETED -> println("Заказ готов")
        ERROR -> println("Ошибка")
    }


}