package lesson_11

class BankAccount(
    val cardHolder: String,
    var balance: Double = 0.0,
) {
    fun addMoney(amount: Double) {
        balance += amount
        println("Внесено:$amount. Текущий баланса - $balance")

    }
}

/*Задача 4: Банковский счет (Изменение состояния)
Создай класс BankAccount.

Свойства: cardHolder (имя владельца) и balance (баланс, изначально 0).

Добавь метод addMoney(amount: Int). Он должен принимать сумму и прибавлять её к текущему балансу,
а также выводить сообщение: "Внесено: [сумма]. Текущий баланс: [баланс]".

В main создай счет, внеси на него 500, а затем еще 1000.*/
