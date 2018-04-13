fun main(args: Array<String>) {

    println(sum(1.0,2.0))
    sayHello()
}

fun sum(num1: Double, num2: Double): Double{
    return num1 + num2
    /*Return double*/
}

fun sayHello(){
    println("Hello world")
    /*Return Unit, and print message*/
}