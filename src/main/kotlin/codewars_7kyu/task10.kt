package codewars_7kyu

fun jadenText(cc: String): String {
    return cc.split(" ").map { it.replaceFirstChar { it.uppercase()} }.joinToString(" ")
}




/*
Задача: "Jaden Casing Strings" Джейден Смит (сын Уилла Смита) известен тем, что в Твиттере пишет Каждое Слово
С Большой Буквы. Твоя задача: превратить обычное предложение в стиль Джейдена.

Пример:

Вход: "How can mirrors be real if our eyes aren't real"

Выход: "How Can Mirrors Be Real If Our Eyes Aren't Real"*/
