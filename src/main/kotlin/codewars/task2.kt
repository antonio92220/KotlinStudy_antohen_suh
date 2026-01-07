package codewars

fun grow(arr: IntArray): Int {
    var multi = 1
    arr.forEach { multi= it * multi }
    return multi
}


/*ИЛИ

fun grow(arr: IntArray): Int {
    return arr.reduce { acc, it -> acc * it }
}*/


/*
Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24*/
