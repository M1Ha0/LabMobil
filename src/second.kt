import javax.swing.text.Position
import java.util.Random

fun main(){
    var arr1=emptyArray<Int>()
    val sum = {x:Int, y:Int ->  while(arr1.size<10)
        {
        var a = Random().nextInt(10,100)
            if(a<=y&&a/10+a%10==x){
                arr1+=a
                a=0
            }
         println(arr1[+1])
        }
    }
    println("Введите N")
    val x = readLine()!!.toInt()
    println("Введите K")
    val y = readLine()!!.toInt()

}






