package LeetCode_easy

fun isValid(s: String): Boolean {
    // Создаем наш стек (стопку)
    val stack = ArrayDeque<Char>()

    for (char in s) {
        when (char) {
            // 1. Если скобка открывающая — просто кладем её наверх стопки
            '(', '[', '{' -> stack.addLast(char)

            // 2. Если закрывающая — проверяем, есть ли ей пара
            ')' -> if (stack.isEmpty() || stack.removeLast() != '(') return false
            ']' -> if (stack.isEmpty() || stack.removeLast() != '[') return false
            '}' -> if (stack.isEmpty() || stack.removeLast() != '{') return false
        }
    }

    // 3. Если мы прошли всю строку, и стопка оказалась пустой — всё супер!
    // Если в стопке что-то осталось (например, была строка "("), вернется false.
    return stack.isEmpty()
}