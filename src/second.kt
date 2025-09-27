import javax.swing.text.Position

fun main(){
    val name = readln()
    hello(name)
}
fun hello(name:String,age:Int=18,position:String="Student"){
    println("hello, $name!. I am $position, I am $age years old ")
}





