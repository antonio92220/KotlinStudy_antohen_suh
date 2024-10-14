package lesson_2

fun main() {
    val salaryPermanentStaff = 50 * 30000
    val salaryAllStaff = 50 * 30000 + 30 * 20000
    val averageSalary = salaryAllStaff / 50 + 30
    println("Общая З/П постоянных сотрудников = $salaryPermanentStaff")
    println("Общие расходы по З/П = $salaryAllStaff")
    println("Средня З/П в компании = $averageSalary")

}