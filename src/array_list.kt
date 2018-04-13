fun main(args: Array<String>) {
    var names = ArrayList<String>()
    println("Insert values")
    for (x in 1..10){
        var name = readLine()!!.toLowerCase()
        names.add(name)
    }

    for (item in names){
        println("Item: ${item}")
    }
    if (names.contains("angel")){
        println("Hay un angel :)")
    }
}