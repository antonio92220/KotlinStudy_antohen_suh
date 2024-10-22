package org.example.lesson_4

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    val totalTables = 13

    println("Доступность столиков на сегодня: ${reservedTablesToday < totalTables}\nДоступность столиков на завтра: ${reservedTablesTomorrow < totalTables}")

}