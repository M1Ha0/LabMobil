import javax.swing.text.Position
import java.util.Random

fun main() {
    print("K = ")
    val k = readLine()!!.toInt()
    print("N = ")
    val n = readLine()!!.toInt()
    val numbers = funsec(k, n)
    println(numbers.joinToString())
}
fun funsec(k: Int, n: Int): List<Int> {
    val numbers = mutableListOf<Int>()

    for (i in 1..n) {
        var sum = 0
        var num = i
        while (num > 0) {
            sum += num % 10
            num /= 10
        }
        if (sum == k) {
            numbers.add(i)
        }
    }

    return numbers
}






