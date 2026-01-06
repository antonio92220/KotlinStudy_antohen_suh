package lesson_20

fun main() {
    val names = listOf("Иван", "Алексей", "Петр", "Антон", "Олег")
    names.filter { it.startsWith("А") }.map { it.uppercase() }.forEach{println(it)}
}



/*
Задание:

Создай список имен: val names = listOf("Иван", "Алексей", "Петр", "Антон", "Олег").

Отфильтруй: Оставь только те имена, которые начинаются на букву "А".

Подсказка: it.startsWith("А").

Преобразуй (.map): Сделай эти имена КАПСОМ (все буквы заглавные).

Подсказка: it.uppercase().

Выведи (.forEach): Распечатай каждое имя с новой строки.

Подсказка: forEach { println(it) }.

Это должно быть одной цепочкой: names.filter...map...forEach.*/
