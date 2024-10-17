package org.example.lesson_3
import java.time.LocalTime

fun main() {

    val userName = "Браток"
    val currentTime = LocalTime.now()
    val morningTimeStart = LocalTime.of(6, 0)
    val eveningTimeStart = LocalTime.of(18, 0)

    if (currentTime.isAfter(morningTimeStart) && currentTime.isBefore(eveningTimeStart)) {
        println("Добрый день,$userName")
    } else {
        println("Добрый вечер,$userName")
    }
}