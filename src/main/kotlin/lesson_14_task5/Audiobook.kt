package lesson_14_task5

class Audiobook (
    title: String,
    author :String,
    val duration : Int,
): Book(title, author){

    override fun read() {
        println("Слушаю аудиокнигу $title  автора $author , длительность $duration мин  ")
    }
}