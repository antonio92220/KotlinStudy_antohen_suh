package lesson_17

class BabelFish {

    var isTranslated = false

    var nerveSignalLevel = 200
        get() = field
        set(value : Int) {
            field = 700
            if (value > 300) {
                isTranslated = true
                println("isTranslated = true")
            }
        }
}