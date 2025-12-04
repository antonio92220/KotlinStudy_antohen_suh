package org.example.lesson_9

fun main() {
    val ticketList = mutableListOf("Task 1", "Task 2")
    ticketList.add("Task 3")
    ticketList.add(0, "Urgent Task")
    ticketList.remove("Task 2")

    println(ticketList)
}


/*
Задача 2: Управление очередью (Изменяемость)
Создай список задач с начальными значениями: "Task 1", "Task 2".

Добавь в конец списка "Task 3".

Вставь "Urgent Task" в самое начало списка (на первую позицию).

Удали из списка "Task 2". Выведи итоговое состояние списка.*/
