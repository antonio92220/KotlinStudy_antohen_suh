package codewars_7kyu

fun findShort(s: String): Int {
    return s.split(" ").map { it.length }.minOrNull()?:0
}



/*

Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.*/
