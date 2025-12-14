package lesson_14_task5

open class Book (
    val title : String,
    val author : String,
)

{
    open fun read (){
        println("Читаю книгу $title")
    }
}