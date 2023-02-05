package ru.netology

data class Comments (
    var count : Int = 0, //количество комментариев;
    var canPost : Boolean = true,//информация о том, может ли текущий пользователь комментировать запись (true — может, 0 — не может);
)