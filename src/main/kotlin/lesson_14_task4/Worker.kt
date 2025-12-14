package lesson_14_task4

open class Worker() {
    open fun work() {
        println("Рабочий работает")
    }

    fun rest() {
        println("Рабочий отдыхает")
    }
}