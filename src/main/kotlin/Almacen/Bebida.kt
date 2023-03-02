package Almacen

abstract class Bebida(precio : Double, litros : Int, var marca : String) {
    abstract fun calcular(cantidad : Int):Double
    companion object{
        var id = 9000
    }

}