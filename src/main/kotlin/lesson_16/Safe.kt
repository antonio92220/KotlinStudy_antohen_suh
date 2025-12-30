package lesson_16

class Safe {
    private var money = 1000

    fun deposit (amount : Int) {
        money += amount
        println("Внесено $amount , баланс $money")

    }
    fun withdraow (amount: Int) {
        if (amount>money)
        {
            println("Нет стока денег")}
        else {
            money -= amount
            println("Снять $amount , остаток $money")
        }


    }


}