package LeetCode_easy


    fun reverseString(char: CharArray) {
        var left = 0
        var right = char.lastIndex

        while (left<right)
        {
            val temp = char[left]
            char[left] = char [right]
            char[right] = temp

            left++
            right--
        }

    }


/*
Тебе дают массив символов, например ['h', 'e', 'l', 'l', 'o'].
Нужно развернуть его задом наперед, чтобы получилось ['o', 'l', 'l', 'e', 'h'].
Главное условие: Нельзя создавать новый массив (использовать дополнительную память).
Нужно менять элементы прямо внутри текущего массива (in-place).*/
