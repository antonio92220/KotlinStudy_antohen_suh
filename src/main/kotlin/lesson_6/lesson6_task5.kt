package org.example.lesson_6

fun main() {
    var startValueRes = 100
    while (true) {
        println("Текущий уровень потребления $startValueRes")
        startValueRes += 50
        if (startValueRes >= RECOMMENDED_LEVEL) {
            println("Критической количество занимаемых ресурсов")
            break
        }
    }
}

const val RECOMMENDED_LEVEL = 500

/*
Имитируй рост потребления ресурса, начиная со значения 100. На каждом шаге потребление увеличивается на 50.
Максимально безопасный уровень — 500. Процесс должен непрерывно сообщать текущий уровень. Если уровень достигает
или превышает 500, процесс должен немедленно остановиться.*/
