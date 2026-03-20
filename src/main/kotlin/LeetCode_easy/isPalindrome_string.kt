package LeetCode_easy

fun isPalindrome(s: String): Boolean {
    // Оставляем только буквы и цифры, переводим в нижний регистр
    val cleanString = s.filter { it.isLetterOrDigit() }.lowercase()
    return cleanString == cleanString.reversed()
}



fun isPalindromeCorrect(s: String): Boolean {
    var left = 0
    var right = s.length-1

    while (left < right) {
        // Пропускаем "мусор" слева.
        // Условие left < right внутри нужно, чтобы не выйти за пределы строки
        while (left < right && !s[left].isLetterOrDigit()) {
            left++
        }

        // Пропускаем "мусор" справа
        while (left < right && !s[right].isLetterOrDigit()) {
            right--
        }

        // Сравниваем символы, приводя их к нижнему регистру
        if (s[left].lowercaseChar() != s[right].lowercaseChar()) {
            return false // Нашли отличие! Это точно не палиндром
        }

        // Символы совпали, идем дальше к центру
        left++
        right--
    }

    // Если дошли до центра и не нашли отличий — это палиндром
    return true
}



/*
Дана строка. Нужно проверить, читается ли она одинаково слева направо и справа налево.
Подвох: Нужно игнорировать пробелы, знаки препинания и разницу между большими и маленькими буквами.

Вход: "A man, a plan, a canal: Panama"

Выход: true (если выкинуть пробелы и запятые, получится amanaplanacanalpanama).*/
