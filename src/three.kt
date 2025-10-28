class Line(val left:Double,  val right:Double){
    val s = right - left
    fun squer()=println(s*s)
}
fun main() {
    print("Введите левую границу: ")
    val left= readLine()!!.toDouble()
    print("Введите правую границу: ")
    val right = readLine()!!.toDouble()
    val line = Line(left, right)
    line.squer()
}


