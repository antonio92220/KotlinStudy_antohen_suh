package lesson_2

fun main() {
    val numberOfPermanentStaff = 50
    val numberOfInterns = 30
    val averageSalaryOfPermanentStaff = 30000
    val averageSalaryOfInterns = 20000

    val salaryPermanentStaff = numberOfPermanentStaff * averageSalaryOfPermanentStaff
    val salaryAllStaff = salaryPermanentStaff + numberOfInterns * averageSalaryOfInterns
    val averageSalary = salaryAllStaff / (numberOfInterns + numberOfPermanentStaff)

    println("Общая З/П постоянных сотрудников = $salaryPermanentStaff")
    println("Общие расходы по З/П = $salaryAllStaff")
    println("Средня З/П в компании = $averageSalary")
}