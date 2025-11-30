package base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

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

    @Test
    fun shouldSortNotNullFirst_WithNullFirst() {
        val names = arrayOfNulls<String>(10)
        names[1] = "Oleg"
        names[5] = "Oleg"
        names[9] = "Oleg"

        defragment(names)

        assertAll(
            { assertThat(names[0]).isNotNull() },
            { assertThat(names[1]).isNotNull() },
            { assertThat(names[2]).isNotNull() },
            { assertThat(names[3]).isNull() }
        )
    }

    @Test
    fun shouldSortNotNullFirst_WithNotNullFirst() {
        val names = arrayOfNulls<String>(10)
        names[0] = "Oleg"
        names[3] = "Oleg"
        names[4] = "Oleg"
        names[8] = "Oleg"

        defragment(names)

        assertAll(
            { assertThat(names[0]).isNotNull() },
            { assertThat(names[1]).isNotNull() },
            { assertThat(names[2]).isNotNull() },
            { assertThat(names[3]).isNotNull() },
            { assertThat(names[5]).isNull() }
        )
    }
}
