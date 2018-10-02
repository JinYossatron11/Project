var num1= ""
var num2= ""
var num3= ""
var sum:Int = 0
fun main(args: Array<String>) {
    println("Num1 = " + num1)
    num1 = readLine()!!
    println("เครื่องหมาย = + - * / " + num3)
    num3 = readLine()!!
    println("Num2 = " + num2)
    num2 = readLine()!!
    checknum3(num3)

}
fun plus(num1:Int,num2:Int){
    sum = num1 + num2
}
fun minus(num1:Int,num2:Int){
    sum = num1 - num2
}
fun kun(num1:Int,num2:Int){
    sum = num1 * num2
}
fun han(num1:Int,num2:Int){
    sum = num1 / num2
}
fun checknum3(num3:String) {
    if(num3 == "+"){
        plus(num1.toInt(),num2.toInt())
        println("sum = $sum ")
    }else  if(num3 == "-"){
        minus(num1.toInt(),num2.toInt())
        println("sum = $sum ")
    }
    else  if(num3 == "*"){
        kun(num1.toInt(),num2.toInt())
        println("sum = $sum ")
    }else  if(num3 == "/"){
        han(num1.toInt(),num2.toInt())
        println("sum = $sum ")
    }else{
        print("Error กรุณาเลือกเครื่องหมาย")
    }
}