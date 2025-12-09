package lesson_11

fun main() {
    // Для первой задачи
    val newProduct: Product = Product(
        name = "iPhone 13",
        price = 50000,
        quantity = 3,
    )

    println("Имя товара - ${newProduct.name}")
    println("Цена товара - ${newProduct.price}")
    println("Штук - ${newProduct.quantity}")

    // Для второй задачи
    println("Начало второй задачи")
    val user1: UserProfile = UserProfile(
        firstName = "Alan",
        lastName = "Nelson",
    )

    val user2: UserProfile = UserProfile(
        firstName = "Bovvy",
        lastName = "Groovy",
        isPremium = true,
    )

    println("1 status - ${user1.isPremium}")
    println("2 status - ${user2.isPremium}")

    // Для третьей задачи
    println("Начало третьей задачи")
    val lamp: SmartLamp = SmartLamp(
    )
    println("Текущая яркость ${lamp.brightess}")
    lamp.turnOn()
    println("Текущая яркость ${lamp.brightess}")

    // Для четвертой задачи
    println("Начало четвертой задачи")
    val safeMoney: BankAccount = BankAccount(
        cardHolder = "Me"
    )
    safeMoney.addMoney(500.0)
    safeMoney.addMoney(1000.0)


    // Для пятой задачи
    println("Начало пятой задачи")
    val ork: GameCharacter = GameCharacter(
        name = "Ork"
    )
    ork.attack(40)
    ork.attack(700)
}