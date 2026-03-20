package LeetCode_easy

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        // Защита от дурака: если длины разные, это точно не анаграммы
        if (s.length != t.length) return false

        // Превращаем строки в массивы символов, сортируем и сравниваем
        return s.toCharArray().sorted() == t.toCharArray().sorted()
    }
}


fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val targetMassiv = IntArray(26)

    for (i in s.indices) {
        targetMassiv[s[i] - 'a']++
        targetMassiv[t[i] - 'a']--
    }

    return targetMassiv.all { it == 0 }
}


/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.*/
