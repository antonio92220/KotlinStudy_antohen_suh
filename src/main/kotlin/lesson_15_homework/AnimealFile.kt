package lesson_15_homework

// abstract запрещает создавать объекты этого класса напрямую
abstract class Animal(val name: String) {
    // абстрактный метод - "заготовка"
    abstract fun eat()
}

class Fish(name: String) : Animal(name), Swimmable {

    // Реализуем метод из абстрактного класса
    override fun eat() {
        println("$name ест рыбий корм")
    }

    // Реализуем метод из интерфейса
    override fun swim() {
        println("$name быстро плывет в воде")
    }
}

fun main() {
    // val test = Animal("Немо") // ОШИБКА! Абстрактные классы нельзя создавать

    val nemo = Fish("Немо")
    nemo.eat()
    nemo.swim()
}
