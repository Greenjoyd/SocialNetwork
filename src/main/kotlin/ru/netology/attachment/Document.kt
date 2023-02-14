package ru.netology.attachment

class Document (
    override val type: String = "document",
    var docAttachments: DocAttachment,
): Attachment

class DocAttachment(
    var id: Int,
    var ownerId: Int,
    var title: String,
    var size: Int,
    var ext: String,
)