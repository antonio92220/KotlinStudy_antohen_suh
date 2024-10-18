package org.example.lesson_3

fun main() {

    var secondNameUser = "Андреева"
    val nameUser = "Татьяна"
    val surnameUser = "Сергеевна"
    var ageUser = 20

    println("В 20 лет о человеке была следующая информация - $secondNameUser $nameUser $surnameUser , $ageUser")
    secondNameUser = "Сидорова"
    ageUser = 22
    println("В 22 года о человеке была следующая информация - $secondNameUser $nameUser $surnameUser , $ageUser")

}