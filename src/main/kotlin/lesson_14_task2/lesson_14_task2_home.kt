package lesson_14_task2

fun main() {
    val animal1 = Animal()
    animal1.makeSound()
    val dog1 = Dog()
    dog1.makeSound()
}


/*
Задача 2: Модификация поведения (override)
Создай класс Animal с методом makeSound(), который выводит: "Животное издает звук".
Не забудь, что класс и метод должны быть открыты для наследования. Создай класс Dog, который наследуется
от Animal. Переопредели метод makeSound() так, чтобы он выводил: "Собака лает: Гав-гав!". В main создай и Animal,
и Dog, и вызови у обоих их звуки.*/
