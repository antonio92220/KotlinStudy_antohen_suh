package lesson_17

fun main () {

   /* val fish = BabelFish()

    println("old value: ${fish.nerveSignalLevel}")
    println("old value: ${fish.isTranslated}")
    fish.nerveSignalLevel = 400
    println("new value: ${fish.nerveSignalLevel}")
    println("new value: ${fish.isTranslated}")*/



        val box = Box()

        box.volume = 50       // Сработает else -> field станет 50
        println(box.volume)   // Выведет 50

        box.volume = 150      // Сработает if -> field станет 100
        println(box.volume)   // Выведет 100
    
}