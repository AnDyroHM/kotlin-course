fun main(args: Array<String>) {

   var sum = showNumber(1,10.2)
    println(sum)
}


fun showNumber(number: Int,number2: Int):Int{
    return number + number2
}
fun showNumber(number: Double,number2: Double):Double{
    return number + number2
}
fun showNumber(number: Int,number2: Double):Double{
    return number + number2
}
fun showNumber(number: Double,number2: Int):Double{
    return number + number2
}