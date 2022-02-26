package com.example.romantests

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun checkCorrectSumA() {
        assertEquals(4, sumA(arrayListOf("аааа")))
        assertEquals(1, sumA(arrayListOf("абвг")))
        assertEquals(2, sumA(arrayListOf("хаха")))
        assertEquals(0, sumA(arrayListOf("azza")))
    }

    @Test
    fun checkValidatePassword(){
        assertEquals(true, checkPassword("QwE123asd!"))
        assertEquals(false, checkPassword("QwE123asd"))
        assertEquals(false, checkPassword("qwe123asd"))
        assertEquals(false, checkPassword("QwE123asd "))
        assertEquals(false, checkPassword(""))
        assertEquals(false, checkPassword("!"))
        assertEquals(false, checkPassword("1"))
        assertEquals(false, checkPassword("A"))
        assertEquals(false, checkPassword("a"))
        assertEquals(true, checkPassword("Норм пароль отвечаю, за 228 !"))
    }
}