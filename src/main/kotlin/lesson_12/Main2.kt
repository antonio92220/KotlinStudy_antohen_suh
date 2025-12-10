package lesson_12

fun main() {
// Задача 1
    println("Задача 1 начало")
    val pasportDetails = Passport (
        series = 123,
        number = 234,
        ownerName = "Сер Гей"
    )
    println("Паспорт ${pasportDetails.series} ${pasportDetails.number} выдан гражданину ${pasportDetails.ownerName}")

    // Задача 2
    println("Задача 2 начало")
    val server1 = Server (serverName = "Eblan1")
    val server2 = Server (serverName = "Eblan2")

    // Задача 3
    println("Задача 3 начало")
    val registrationClassName = RegistrationClass (name = "Anton", number = 15)

    // Задача 4
    println("Задача 4 начало")

    // 1. Создание ПРЯМОУГОЛЬНИКА (вызывается первичный конструктор)
    val rectangle = GeomtryFigure(width = 5, height = 10)
    println("Прямоугольник: Ширина ${rectangle.width}, Высота ${rectangle.height}")

    // 2. Создание КВАДРАТА (вызывается вторичный конструктор)
    val square = GeomtryFigure(side = 4)
    println("Квадрат: Ширина ${square.width}, Высота ${square.height}")



    // Задача 5
    println("Задача 5 начало")
    val car1 = Car (brand = "Mercedes", year = 2145)

}