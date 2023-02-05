package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val post = Post()
        WallService.add(post)
        val result = post.id
        assertEquals(1,result)
        }

    @Test
    fun update(){
        val post = Post(id=0)
        WallService.update(post)
        val result = WallService.update(post)
        assertEquals(false,result)
    }
    @Test
    fun addUpdate(){
        val post = Post(id=0)
        WallService.add(post)
        val result = (WallService.update(post))
        assertEquals(true,result)
    }
}