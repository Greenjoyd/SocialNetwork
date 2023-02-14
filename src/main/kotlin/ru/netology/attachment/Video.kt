package ru.netology.attachment

class Video (
    override val type: String = "video",
    var videoAttachment: VideoAttachment,
) : Attachment

class VideoAttachment(
    var id: Int,
    var ownerId: Int,
    var title: String,
    var description: String,
    var duration: Int,
)