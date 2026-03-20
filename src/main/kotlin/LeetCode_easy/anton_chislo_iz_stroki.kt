package LeetCode_easy

// Если число может быть больше Лонг или Инт
class Solution {
    fun findMaxNumber(s: String): String {
        var currentNum = StringBuilder()
        var maxNum = ""
        fun updateMax() {
            if (currentNum.isNotEmpty()) {
                val currentStr = currentNum.toString()
                if (currentStr.length > maxNum.length ||
                    (currentStr.length == maxNum.length && currentStr > maxNum)) {
                    maxNum = currentStr
                }
                currentNum.clear()
            } }
        for (char in s) {
            if (char.isDigit()) {
                currentNum.append(char) // Если цифра — копим
            } else {
                updateMax()  } }
        updateMax()
        return maxNum
    }
}
/// ЕСЛИ ПОМЕСТИТСЯ В ЛОНГ
class Solution2 {
    fun findMaxNumber(s: String): Long {
        var currentNum = StringBuilder()
        // Изначально ставим -1, чтобы любое найденное число (даже 0) было больше
        var maxNum = -1L
        // Вспомогательная функция для обновления максимума
        fun updateMax() {
            if (currentNum.isNotEmpty()) {
                // Просто превращаем собранную строку в Long
                val num = currentNum.toString().toLong()
                // Обычное математическое сравнение!
                if (num > maxNum) {
                    maxNum = num
                }
                // Очищаем копилку
                currentNum.clear()
            }
        }
        // Идем по строке
        for (char in s) {
            if (char.isDigit()) {
                currentNum.append(char)
            } else {
                updateMax()
            }
        }
        // Не забываем про проверку в самом конце!
        updateMax()

        // Если чисел вообще не было (maxNum остался -1), можем вернуть 0
        return if (maxNum == -1L) 0L else maxNum
    }
}

/*
Есть строка рандомная 23412341234апвапвп1231243123

        Нужно вытащить из нее максимальное число*/
