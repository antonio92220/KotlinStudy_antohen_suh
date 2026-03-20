package LeetCode_easy

fun sortedSquaresSimple(nums: IntArray): IntArray {
    // map превращает каждый элемент в его квадрат, а sorted() сортирует по возрастанию
    return nums.map { it * it }.sorted().toIntArray()
}


fun sortedSquares(nums: IntArray): IntArray {
    val newArray = IntArray(nums.size)

    var left = 0
    var right = nums.lastIndex

    var insertIndex = nums.lastIndex

    while (left <= right) {
        val leftSqrt = nums[left] * nums[left]
        val rightSqrt = nums[right] * nums[right]

        if (leftSqrt > rightSqrt) {
            newArray[insertIndex] = leftSqrt
            left++
        } else {
            newArray[insertIndex] = rightSqrt
            right--
        }
        insertIndex--
    }
    return newArray
}



/*
Дан отсортированный массив чисел.
Нужно вернуть отсортированный массив квадратов этих чисел.*/
