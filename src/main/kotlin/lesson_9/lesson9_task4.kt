package org.example.lesson_9

fun main() {
    val filesNameList = mutableListOf("system.log", "test.jpg", "error.log", "config.xml", "app.log")
    val newFilesNameList = mutableListOf<String>()
    filesNameList.forEach {
        if (it.endsWith(".log")) {
            newFilesNameList.add(it)
        }
    }
    println(newFilesNameList)
}

/*
Задача 4: Фильтрация логов
Дан список строк (имена файлов): "system.log", "test.jpg", "error.log", "config.xml", "app.log".
Создай новый список, в который попадут только те файлы, название которых заканчивается на ".log".
Выведи этот новый список.*/
