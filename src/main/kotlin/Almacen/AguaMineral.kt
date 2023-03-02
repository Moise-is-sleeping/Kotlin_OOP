package Almacen

class AguaMineral(var precio: Double, litros : Int, marca : String, manatialOrigen : String):Bebida(precio,litros,marca){
    var identificator = 0
        set(value) {
            field = id
            id += 1
        }
    override fun calcular(cantidad: Int):Double {
        return precio * cantidad
    }

}