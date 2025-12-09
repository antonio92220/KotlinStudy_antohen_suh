package lesson_11

class UserProfile (
    val firstName : String,
    val lastName : String,
    val isPremium : Boolean = false,
)

/*
Задача 2: Настройки профиля (Значения по умолчанию)
Создай класс UserProfile.

У него должны быть свойства: firstName, lastName и isPremium (булево).

Сделай так, чтобы свойство isPremium по умолчанию было равно false (то есть, при создании пользователя
его не нужно было бы указывать явно, если он не премиум).

В main создай двух пользователей: одного обычного (не указывая статус) и одного премиального (указав true).
Выведи их статусы.*/
