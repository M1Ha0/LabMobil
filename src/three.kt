fun main() {
    //11.1
    print("Введите левую границу: ")
    val left= readLine()!!.toDouble()
    print("Введите правую границу: ")
    val right = readLine()!!.toDouble()
    val line = Line(left, right)
    line.squer()
    //11.2
}
//11.1
class Line(val left:Double,  val right:Double){

    val s = right - left
    fun squer()=println(s*s)
}
//11.2
//class Chek(val x:Double) : Line(left,right){
//
//}

