package ru.netology

import org.junit.Test

import org.junit.Assert.*
import ru.netology.exeptions.PostNotFoundExeption

class WallServiceTest {

    @Test
    fun add() {
        val likesCount = Likes()
        val isDonut = Donut()
        val viewsCount = Views()
        val post = Post(likes = likesCount, donut = isDonut, views = viewsCount)
        WallService.add(post)
        val result = post.id
        assertEquals(1,result)
        }

    @Test
    fun update(){
        val likesCount = Likes()
        val isDonut = Donut()
        val viewsCount = Views()
        val post = Post(likes = likesCount, donut = isDonut, views = viewsCount)
        WallService.update(post)
        val result = WallService.update(post)
        assertEquals(false,result)
    }
    @Test
    fun addUpdate(){
        val likesCount = Likes()
        val isDonut = Donut()
        val viewsCount = Views()
        val post = Post(likes = likesCount, donut = isDonut, views = viewsCount)
        WallService.add(post)
        val result = (WallService.update(post))
        assertEquals(true,result)
    }
    @Test
    fun createCommentCorrect() {
        val likesCount = Likes()
        val isDonut = Donut()
        val viewsCount = Views()
        val post = Post(likes = likesCount, donut = isDonut, views = viewsCount)
        WallService.add(post)

        var newComment = Comment()
        val result = WallService.createComment(1, newComment)

        assertEquals (newComment, result)
    }
    @Test(expected = PostNotFoundExeption::class)
    fun shouldThrowPost() {
        val likesCount = Likes()
        val isDonut = Donut()
        val viewsCount = Views()
        val post = Post(likes = likesCount, donut = isDonut, views = viewsCount)
        WallService.add(post)

        var newComment = Comment()
        WallService.createComment(111, newComment)
    }
}