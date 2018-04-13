open class Frute(){

    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    var frescura:Int = 100
    var pudrirse:Int = 0
    var numHojas:Int= 0

    constructor(color:String, sabor:String, precio:Int):this(){
        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = 100
    }

    constructor(color:String, sabor:String, precio:Int, numHojas:Int):this(){
        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = 100
        this.numHojas = numHojas
    }
 /*   init {
        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = 100
    }*/

    fun pudrirse(cant: Int = pudrirse){
        this.frescura -= cant
    }

    fun showStatus(){
        val frescura = this.frescura
        if (frescura <= 0){
            println("Tu fruta se ha podrido")
        }else{
            println("Fruta con frescura al $frescura%")
        }
    }
}
class FruteWithGrease():Frute(){
    var grease:Int = 0
    constructor(grease: Int):this() {
        this.grease = grease
    }
}
fun main(args: Array<String>){
    val manzanaConHojas  = Frute(color = "Rojo",sabor = "Dulce",precio = 4, numHojas = 4)
    manzanaConHojas.pudrirse(cant = 110)
    manzanaConHojas.showStatus()
    println(manzanaConHojas.numHojas)

    var manzanaSinHojas = Frute(color = "Rojo", sabor = "Agrio", precio = 10)
    println(manzanaSinHojas.color)

    println("FruteWithGrease Class---")
    var avocado = FruteWithGrease(grease = 10)
    avocado.color = "Verde"
    println(avocado.color)
}