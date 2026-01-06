package lesson_21

fun main() {
    println("hello".addSmile())
}


fun String.addSmile(): String {
    return "$this :-)"
}


/*
Попробуй прямо сейчас написать Extension для String, который делает строку веселой
— добавляет смайлик :-) в конец. Например: "Привет".addSmile() должно вернуть "Привет :-)".*/
