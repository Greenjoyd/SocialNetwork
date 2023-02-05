package ru.netology

data class Post(
    var id: Int=0,
    val ownerId: Int = 112,
    val fromId: Int = 113,
    val date: Int = 19_01_2023,


    val text: String = "",
    val postType: String = "",

    val markedAsAds: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = true,
    val canPin: Boolean = true,
)

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
    val post1 = Post(id = 1)
    val post2 = Post(id = 2)
    WallService.add(post1)
    WallService.add(post2)
    WallService.printAll()
    WallService.update(Post(id=2))
}