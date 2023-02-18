import java.util.*

fun main(args: Array<String>) {
    println("Введите предложение:")
    val scanner = Scanner(System.`in`)// прочитать всю строку
    val line = scanner.nextLine()
    val list = line.split(' ')
    var result = arrayListOf<String>();
    for (word in list){
        if (word.length%2!=0){
            result += word.reversed()
        }
    }
    println(result)
}