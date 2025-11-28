package org.example.lesson_4

fun main() {
    val levelOfUser = 5
    val toggleOfAccess = true
    val accessGranted = (levelOfUser >= NEED_LEVEL_FOR_USER) && (toggleOfAccess)

    println("Доступ получен? - $accessGranted")

}

const val NEED_LEVEL_FOR_USER = 10

/*Задача 4: Доступ к фиче (Logic && + Constants)
Пользователь получает доступ к бета-функции, только если он "Опытный" И у него включена настройка "Beta Access".

Создай переменную уровня пользователя (число, например 5).

Создай булеву переменную галочки доступа (true).

Создай переменную-условие (константу), какой уровень считается "Опытным" (например, 10).

Создай итоговую переменную accessGranted. Она равна true, только если:

Уровень пользователя больше или равен уровню опытного.

И включена галочка доступа.

Выведи результат одной строкой с пояснением.*/
