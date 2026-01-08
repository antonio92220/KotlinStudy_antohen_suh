package codewars

fun sum(numbers: IntArray): Int {
    return numbers.filter {it>0}.sum()
}



/*inputList.forEach {
    if (it.startsWith("192.")) {
        resultList.add(it)
    }
}*/



/*
Task
You get an array of numbers, return the sum of all of the positives ones.

Example
[1, -4, 7, 12] =>
1
+
7
+
12
=
20
1+7+12=20
Note
If there is nothing to sum, the sum is default to 0.

*/
