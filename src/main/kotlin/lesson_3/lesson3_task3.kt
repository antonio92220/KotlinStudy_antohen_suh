package org.example.lesson_3

fun main() {

    val numberForTable = 6
    val multiplicationTable = """
        $numberForTable * 1 = ${numberForTable * 1}
        $numberForTable * 2 = ${numberForTable * 2}
        $numberForTable * 3 = ${numberForTable * 3}
        $numberForTable * 4 = ${numberForTable * 4}
        $numberForTable * 5 = ${numberForTable * 5}
        $numberForTable * 6 = ${numberForTable * 6}
        $numberForTable * 7 = ${numberForTable * 7}
        $numberForTable * 8 = ${numberForTable * 8}
        $numberForTable * 9 = ${numberForTable * 9}
    """.trimIndent()
    println(multiplicationTable)
}