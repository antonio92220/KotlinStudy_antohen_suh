package codewars


fun calculateYears(years: Int): IntArray { // Было Array<Int>
    return when {
        years == 1 -> intArrayOf(years, FIRST_YEAR_CONST_CAT, FIRST_YEAR_CONST_DOG) // было arrayOf
        years == 2 -> intArrayOf(
            years,
            FIRST_YEAR_CONST_CAT + SECOND_YEAR_CONST_CAT,
            FIRST_YEAR_CONST_DOG + SECOND_YEAR_CONST_DOG
        )

        else -> intArrayOf(
            years,
            FIRST_YEAR_CONST_CAT + SECOND_YEAR_CONST_CAT + MORE_2_YEAR_CONST_CAT * (years - 2),
            FIRST_YEAR_CONST_DOG + SECOND_YEAR_CONST_DOG + MORE_2_YEAR_CONST_DOG * (years - 2)
        )
    }
}

const val FIRST_YEAR_CONST_CAT = 15
const val FIRST_YEAR_CONST_DOG = 15
const val SECOND_YEAR_CONST_CAT = 9
const val SECOND_YEAR_CONST_DOG = 9
const val MORE_2_YEAR_CONST_CAT = 4
const val MORE_2_YEAR_CONST_DOG = 5


/*Kata Task
*//*
I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that*/
