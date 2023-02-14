package ru.netology.attachment

class Link (
    override val type: String = "Link",
    var linkAttachment: LinkAttachment,
):Attachment

class LinkAttachment(
    var url: String,
    var title: String,
    var capiton: String,
    var description: String,
    var previewUrl: String
)