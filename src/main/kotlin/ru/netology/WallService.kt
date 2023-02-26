package ru.netology

import ru.netology.exeptions.PostNotFoundExeption

object WallService {
    private var lastId = 0
    private var lastComment = 0
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()


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

    fun createComment(postId: Int, comment: Comment): Comment {
        for ((index, postsId) in posts.withIndex()) {
            if (postId == postsId.id) {
                comments += comment
                comment.id = ++lastComment
                return comments.last()
            }
        }
        throw PostNotFoundExeption("Пост не существует")
    }

    fun printAll() {
        for (post in posts) {
            println(post)
        }
        println("---------")
    }
}
