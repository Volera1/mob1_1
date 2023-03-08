import java.util.*

fun main() {
    println("Введите предложение:")
    val scan = Scanner(System.`in`)
    val line = scan.nextLine()

    val result = stringChange(line)
    println(result)
}

fun stringChange(line: String): String {
    val message = if (line.isNotEmpty()) {
        val list = line.split(' ')
        val result = arrayListOf<String>()
        for (word in list) {
            if (word.length % 2 != 0) {
                result += word.reversed()
            }
        }
        if (result.size > 0) {
            result.joinToString(" ")
        } else {
            "Не обнаружено слов с нечетным количеством символов"
        }
    } else {
        "В строке нет слов"
    }

    return message

}
