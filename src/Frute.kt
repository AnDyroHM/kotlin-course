class Frute(color:String, sabor:String, precio:Int){

    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    init {
        this.color = color
        this.sabor = sabor
        this.precio = precio
    }
}

fun main(args: Array<String>){
    var manzana  = Frute(color = "Rojo",sabor = "Dulce",precio = 4);
    println(manzana.color)
}