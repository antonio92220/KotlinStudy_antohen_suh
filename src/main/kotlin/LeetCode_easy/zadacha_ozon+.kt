package LeetCode_easy

fun deleteDoubles(nums: IntArray) : IntArray{
    val uniqueArray = mutableListOf<Int>()

    for (i in nums)
        if (i !in uniqueArray)
        {
            uniqueArray.add(i)
        }
 return uniqueArray.toIntArray()
}

fun deleteDoubles2(Array: IntArray) {
    Array.distinct().toIntArray()
}

fun deleteDoubles3(Array: IntArray) :IntArray {
    return Array.toSet().toIntArray()
}

/*
Дан массив [1,2,5,6,6,7,1]
Вернуть массив без повторяющихся цифр
То есть он должен стать [1,2,5,6,7]*/
