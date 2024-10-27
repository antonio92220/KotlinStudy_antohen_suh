package org.example.lesson_4

fun main() {
    val day = 5
    val isArmAndAbsDay = day % 2 != 0

    println(
        """
        Упражнения для рук: $isArmAndAbsDay
        Упражнения для ног: ${!isArmAndAbsDay}
        Упражнения для спины: ${!isArmAndAbsDay}
        Упражнения для пресса: $isArmAndAbsDay
    """.trimIndent()
    )
}


