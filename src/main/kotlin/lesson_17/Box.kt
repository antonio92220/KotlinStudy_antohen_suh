package lesson_17

class Box {

    var volume = 0
        set(value) {
            if (value > 100) {
                field = 100
            } else {
                field = value
            }
        }

}