package ru.netology.attachment

class Audio(
    override val type: String = "audio",
    var audioAttachment: AudioAttachment,
) : Attachment
class AudioAttachment (
    var id: Int,
    var ownerId: Int,
    var artist: String,
    var title: String,
    var duration: Int
)