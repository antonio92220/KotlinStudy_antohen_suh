package lesson_1

fun main() {
    val totalSecondsInSpace = 6480
    val minuteInHour = 60
    val secondsInMinute = 60
    val hours = totalSecondsInSpace / (minuteInHour*secondsInMinute)
    val remainingSecondsAfterHours = totalSecondsInSpace % (minuteInHour*secondsInMinute)
    val minutes = remainingSecondsAfterHours / minuteInHour
    val seconds = remainingSecondsAfterHours % secondsInMinute

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}
