package ru.netology



object WallService {
    private var lastId = 0

    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        post.id = ++lastId
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, currentPost) in posts.withIndex()) {
            if (post.id == currentPost.id) {
                posts[index] = post.copy()
                return true
            }
        }
        return false
    }

    fun printAll() {
        for (post in posts) {
            println(post)
        }
        println("---------")
    }
}

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