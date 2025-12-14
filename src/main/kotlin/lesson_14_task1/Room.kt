package lesson_14_task1

open class Room(
    val nameRoom: String,
    val area: Int,
) {
    fun description() {
        println("Это комната $nameRoom площадью $area кв.м")
    }

}