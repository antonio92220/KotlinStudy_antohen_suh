package lesson_21

fun main() {
    val number = 5

    // Раньше так было нельзя, а теперь можно!
    val result = number.square()

    println(result) // Выведет 25
}

// Мы говорим: "Хочу, чтобы у ВСЕХ Int появилась функция square"
fun Int.square(): Int {
    // this - это само число, у которого мы вызвали функцию
    return this * this
}


