import java.util.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//Одномерный массив
val mas=  Array(10) { _ -> Random().nextInt(-10,11) }
var k = 0
    for (n in mas)
{
        if (n<0){k++}
}
println("Одномерный массив: $k")
//Двумерный массив
    var cinema = arrayOf<Array<Int>>()
    for (i in 0..19){
        var array= arrayOf<Int>()
        for (j in 0..9){
            array+=Random().nextInt(2,6)
   }
        cinema+=array
    }
    var h = 0
    for (row in cinema) {
        for (value in row) {
            print("$value \t")
            h+=value

        }
        println()
    }
    println("Двумерный массив: ${h/200}.${h%200}")
}
