package Compra

class NoPercedero (nombre : String,precio : Double,tipo : String):Producto(nombre, precio) {

    var tipo = tipo
        set(value) {
            if(value in tipos){
                field = value
            }else{
                field = "Otro"
            }
        }
    init {
        this.tipo = tipo
    }
    override fun info() {
        println("Nombre : $nombre\nPrecio : $precio\nTipo : $tipo")
    }
}