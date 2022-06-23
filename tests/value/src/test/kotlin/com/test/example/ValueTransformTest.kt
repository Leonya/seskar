package com.test.example

import kotlin.test.Test
import kotlin.test.assertEquals

class ValueTransformTest {
    @Test
    fun age_second() {
        val array = getArray("first", Age(42))
        assertEquals("first", array[0])
        assertEquals(42, array[1])
    }

    @Test
    fun age_first() {
        val array = getArray(Age(13), "second")
        assertEquals(13, array[0])
        assertEquals("second", array[1])
    }
}

private fun getArray(
    vararg dependencies: Any?,
): Array<out Any?> =
    dependencies