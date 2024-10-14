fun main() {
    val totalSecondsInSpace = 6480

    val hours = totalSecondsInSpace / 3600
    val remainingSecondsAfterHours = totalSecondsInSpace % 3600

    val minutes = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println("Время в космосе: $formattedTime")
}
