package org.example.lesson_3

fun main() {
    val bugTitle = "Заголовок бага"
    val bugReport = """
        $bugTitle
        Шаги для воспроизведения бага:
        1. Шаг один
        2. Шаг два
        3. Шаг три
    """.trimIndent()

    println(bugReport)

}

/*
Сформируй описание бага, используя многострочный литерал (тройные кавычки).
Создай переменную bugTitle со значением "UI issue on Checkout page".
Создай многострочную переменную bugDescription, которая содержит:
Заголовок бага (bugTitle) с помощью интерполяции.
Несколько строк текста с любыми отступами, описывающих шаги:
Steps to reproduce:
1. Add item to cart.
2. Open checkout.
3. Button "Pay" is missing.
Примени к этой переменной функцию удаления общего отступа (.trimIndent()).
Выведи bugDescription.*/
