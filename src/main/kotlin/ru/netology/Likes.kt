package ru.netology

data class Likes (
    var count : Int = 0, //число пользователей, которым понравилась запись;
    var userLikes : Boolean = false, // наличие отметки «Мне нравится» от текущего пользователя (true — есть, false — нет);
    var canLike: Boolean = true//информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (true — может, false — не может);
)