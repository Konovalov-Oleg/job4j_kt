package ru.job4j.base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CalcTest {
    @Test
    fun when1Plus1() {
        assertThat(add(1, 1)).isEqualTo(2)
    }

    @Test
    fun when1Minus1() {
        assertThat(subtract(1, 1)).isEqualTo(0)
    }

    @Test
    fun when2Multiply2() {
        assertThat(multiply(2, 2)).isEqualTo(4)
    }

    @Test
    fun when2Divide2() {
        assertThat(divide(5, 2)).isEqualTo(2)
    }

    @Test
    fun shouldGetMaxFrom2Numbers() {
        assertThat(max(6, 2)).isEqualTo(6)
    }

    @Test
    fun shouldGetMaxFrom3Numbers() {
        assertThat(max(5, 6, 2)).isEqualTo(6)
    }
}