package org.example.lesson_3

fun main() {

    val host = "https://api.myapp.com"
    val path = "/users"
    val fullUrl = host + path
    println(fullUrl)
}

/*
Задача 1: Конкатенация (Простая)
Создай две переменные, содержащие части URL-адреса.
Переменная host со значением "https://api.myapp.com".
Переменная path со значением "/users".
Создай третью переменную fullUrl, объединив host и path с помощью оператора конкатенации.
Выведи fullUrl в консоль.*/
