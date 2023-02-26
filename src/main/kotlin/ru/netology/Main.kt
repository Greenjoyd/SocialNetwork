package ru.netology

fun main(){
    val likesCount = Likes()
    val isDonut = Donut()
    val viewsCount = Views()
    val post1 = Post(id =1,likes = likesCount, donut = isDonut, views = viewsCount)
    val post2 = Post(id = 2,likes = likesCount, donut = isDonut, views = viewsCount)
    WallService.add(post1)
    WallService.add(post2)
    WallService.printAll()
    WallService.update(Post(id=2, likes = likesCount, donut = isDonut, views = viewsCount))
}