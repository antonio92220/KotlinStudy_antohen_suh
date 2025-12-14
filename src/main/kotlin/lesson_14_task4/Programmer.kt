package lesson_14_task4

class Programmer : Worker() {
    override fun work() {
        println("Программист пишет код")
    }

    fun drinkCoffee() {
        println("Программист пьет кофе")
    }
}