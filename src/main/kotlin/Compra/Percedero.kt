package Compra

class Percedero(nombre : String,precio : Double,var diasACaducar : Int):Producto(nombre, precio){

    override fun info() {
        println("Nombre : $nombre\nPrecio : $precio\nDias a caducar : $diasACaducar")
    }

    override fun calcular(cantidad : Int):Double{
        precio = when(diasACaducar){
            1 -> precio/4
            2 -> precio/3
            3 -> precio/2
            else -> precio
        }
        return precio*cantidad
    }
}