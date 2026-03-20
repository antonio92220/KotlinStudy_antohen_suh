package LeetCode_easy


fun moveZeroes(nums: IntArray): Unit {
    var insertIndex = 0

    for (i in nums.indices) {
        if (nums[i] != 0) {
            nums[insertIndex] = nums[i]
            insertIndex++
        }
    }

    while (insertIndex < nums.size) {
        nums[insertIndex] = 0
        insertIndex++
    }

}

/*


Последний рывок: Move Zeroes (Перенос нулей)
Эта задача — база для QA Automation. Она проверяет, как ты работаешь с индексами массива «на лету», не создавая новые списки (это экономит память).

Задача:
Дан массив nums. Нужно переместить все 0 в конец, сохранив относительный порядок остальных элементов.

Вход: [0, 1, 0, 3, 12]

Выход: [1, 3, 12, 0, 0]

Решение на Kotlin (Паттерн «Медленный и быстрый указатель»):*/
