class Frute(color:String, sabor:String, precio:Int){

    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    var frescura:Int = 100
    var pudrirse:Int = 0
    init {
        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = 100
    }

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

fun main(args: Array<String>){
    val manzana  = Frute(color = "Rojo",sabor = "Dulce",precio = 4)
    manzana.pudrirse(cant = 110)
    manzana.showStatus()
}