package ru.netology.attachment

class Note (
    override val type: String = "Note",
    var noteAttachment: NoteAttachment,
):Attachment
class NoteAttachment(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val text: String,
    val date: Int
)