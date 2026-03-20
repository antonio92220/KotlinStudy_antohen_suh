package LeetCode_easy

class Solution2 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mapWithDigits = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val currentNumber = nums[i]
            val targetNumber = target - currentNumber

            if (targetNumber in mapWithDigits) {
                return intArrayOf(i, mapWithDigits[targetNumber]!!)
            }

            mapWithDigits[currentNumber] = i
        }

        return intArrayOf()
    }

}


/*
Two Sum (Сумма двух чисел) — LeetCode #1: Найти в массиве индексы двух чисел, которые в сумме дают заданный target.

Условие на пальцах
У тебя есть массив чисел: [2, 7, 11, 15]
И есть число-цель (target): 9
Тебе нужно вернуть индексы двух чисел, которые в сумме дают 9. В нашем случае это числа 2 (индекс 0) и 7 (индекс 1).
Ответ: [0, 1].*/
