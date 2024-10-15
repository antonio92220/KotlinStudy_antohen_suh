package org.example.lesson_2

fun main() {
    val hourOfDeparture = 9
    val minutesOfDeparture = 39
    val travelTimeInMinutes = 457
    val hoursInDay = 24
    val minutesInHour = 60

    val arrivalTimeInMinutes = (hourOfDeparture*minutesInHour)+minutesOfDeparture+travelTimeInMinutes
    val arrivalHours = (arrivalTimeInMinutes/minutesInHour)%hoursInDay
    val arrivalMinutes = arrivalTimeInMinutes%minutesInHour

    println(String.format("%02d:%02d", arrivalHours, arrivalMinutes))
}