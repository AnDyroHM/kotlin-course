fun main(args: Array<String>) {
    var mutableLs = mutableSetOf(2,12,32,23)
    mutableLs.add(12) /*Work*/

    var noMutable = setOf(1,2,3,4,5,6)
    /*noMutable.add(1) no work*/

    if (noMutable.none { it <= 6 }) println("No items above or equal 6")
}