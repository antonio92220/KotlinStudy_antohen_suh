package org.example.lesson_4

const val SUN: Boolean = true
const val TENT_IS_OPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val NON_FAVORABLE_SEASON: String = "зима"

fun main() {
    val sunToday: Boolean = true
    val tentNow: Boolean = true
    val airHumidityNow: Int = 20
    val seasonNow = "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? ${SUN == sunToday && tentNow == TENT_IS_OPEN &&
            airHumidityNow == AIR_HUMIDITY && seasonNow != NON_FAVORABLE_SEASON}")
}