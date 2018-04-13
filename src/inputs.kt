fun main(args: Array<String>){
    println("Insert your name: ")
    var name = readLine()
    println("Insert your age: ")
    var age = readLine()!!.toInt()
    println("Name: ${name}")
    println("Age: ${age}")
}