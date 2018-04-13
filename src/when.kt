fun main(args: Array<String>) {
    var num:Int
    var message=""
    println("Insert number")
    num = readLine()!!.toInt()

    when(num){
        1,2 ->{
            message = "Value has 1 or 2"
        }
        in 1..10 ->{
            message = "Value is in 1..10"
        }
        !in 10..100 ->{
            message = "Values in not include in 1..100"
        }
    }

    println(message)
}