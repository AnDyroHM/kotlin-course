fun main(args: Array<String>) {
    var res = Array<String>(5){""}
    for (x in 0..4){
        print("Insert value: ")
        res[x] = readLine()!!
    }

    for (x in 0..4){
        println("Res values position ${x} is: ${res[x]}")
    }
}