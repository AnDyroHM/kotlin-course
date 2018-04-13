fun main(args: Array<String>) {
    var users = HashMap<Boolean,String>()
    var countUser = readLine()!!.toInt()
    println("Create new users")
    for (user in 1..countUser){
        println("Name for user No. ${user}: ")
        var userName = readLine()!!
        println("${userName} is admin? true/talse")
        var isAdmin = readLine()!!.toBoolean()
        users.put(isAdmin,userName)
        println("User ${userName} has created, admin is ${isAdmin}")
    }

    for (k in users.keys){
        println("${users.get(k)}")
    }
}