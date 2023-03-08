import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {


    @Test
    fun stringChangeTestRight() {
        assertEquals("sdm lbg", stringChange("soda mds gbl do"))
    }

    @Test
    fun stringChangeTestExeptionNull() {
        assertEquals("В строке нет слов", stringChange(""))
    }

    @Test
    fun stringChangeNullResult() {
        assertEquals("Не обнаружено слов с нечетным количеством символов", stringChange("soda df"))
    }
}