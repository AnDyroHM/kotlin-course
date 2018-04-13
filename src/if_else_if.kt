fun main(args: Array<String>) {
    println("Insert number:")
    var num = readLine()!!.toDouble()
    var message:String?
    if (num > 90) {
        message = "Has pasado"
    }else if(num >= 70 && num < 90){
        message = "Por poco paps"
    }else if(num>= 60 && num < 70){
        message = "Ya matate?"
    }else{
        message = "Estás jodido paps"
    }

    println(message)
}