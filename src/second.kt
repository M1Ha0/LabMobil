import javax.swing.text.Position
import java.util.Random

fun main(){
    var arr1=arrayOfNulls<Int>(10)
    val sum = {x:Int, y:Int ->  for(i in 0..10)
        {
        var a = Random().nextInt(10,100)
            if(a<=y&&a/10+a%10==x){
                arr1+=a
                a=0
            }
         println(arr1[i])
        }
    }
}






