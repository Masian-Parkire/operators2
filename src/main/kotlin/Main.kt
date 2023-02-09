fun main (){
name()
sum(79,46,78,91)
add()
fact()
}


fun name(){
var name = "Masian"
    println("Hello" + " " + name)
}
fun add(){
    var y = 60
    var x = 13
    var sum = y % x
    println(sum)
}
fun sum (num1:Int, num2:Int, num3:Int, num4:Int){
    var sum = num1 + num2 + num3 + num4
    println(sum)
}
fun fact(){
    var fact= "I am an awesome person and I love Kotlin"
    println(fact)
}