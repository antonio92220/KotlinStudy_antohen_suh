package lesson_18

import java.util.*


class NotesAppItem {

    fun addItemToCell (
        title : String,
        creation: Date,
        type: String,
        data : String

    ) {

        println("Item \"$title\" added to cell - $creation\nType: $type\nData - $data")
    }
}