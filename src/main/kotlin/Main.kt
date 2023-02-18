import java.util.*

fun main(args: Array<String>) {
    println("Введите предложение:")
    val scan = Scanner(System.`in`)
    val line = scan.nextLine()

    val result = stringChange(line)
    println(result)
}
fun stringChange(line:String):String {
    val list = line.split(' ')
    val result = arrayListOf<String>()
    for (word in list){
        if (word.length%2!=0){
            result += word.reversed()
        }
    }
    return(result.toString())
}
