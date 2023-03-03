package Almacen

class bebidaAzucaradavar ( precio: Double, litros : Int, marca : String, porcentajeAzucar : Int):Bebida(precio,litros,marca){
    private var promocion = 0.1
    var identificator = 0
        set(value) {
            field = id
            id += 1
        }
    override fun calcular(cantidad: Int): Double {
        return cantidad * (precio-(precio*promocion))
    }
}