package ru.netology

data class Post (
    var id: Int=0,//Идентификатор записи.
    val ownerId: Int = 0,//Идентификатор владельца стены, на которой размещена запись.
    val fromId: Int = 0,//Идентификатор автора записи.
    val date: Int = 0,//Время публикации записи.
    var createBy: Int = 0,//Идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.
    var replyOwnerId: Int = 0,//Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    var replyPostId: Int = 0, //Идентификатор записи, в ответ на которую была оставлена текущая.
    var is_pinned: Int = 0, // Информация о том, что запись закреплена.




    val text: String = "",//Текст.
    val postType: String = "",// Тип записи.

    val markedAsAds: Boolean = false,//Информация о том, содержит ли запись отметку «реклама».
    val canDelete: Boolean = false,// Информация о том, может ли текущий пользователь удалить запись.
    val canEdit: Boolean = true,//Информация о том, может ли текущий пользователь редактировать запись.
    val canPin: Boolean = true,//Информация о том, может ли текущий пользователь закрепить запись.
    var friendsOnly: Boolean = false, //true, если запись была создана с опцией «Только для друзей».
    var isFavorite: Boolean = true, //true, если объект добавлен в закладки у текущего пользователя.


    var comments: Comments? = null, // Информация о комментариях к записи.
    var copyright: Copyright? = null, // Источник материала.
    var likes: Likes, // Информация о лайках к записи.
    var reposts: Reposts? = null, //Информация о репостах записи.
    var views: Views, // Информация о просмотрах записи.
    var geo: Geo? = null, // Информация о местоположении.
    var signerId: Int? = null, //Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем.
    var donut: Donut, // Информация о записи VK Donut
    var postponedId: Int = 0, // Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.


)