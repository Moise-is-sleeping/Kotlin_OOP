package Compra

class NoPercedero (nombre : String,precio : Double,tipo : String):Producto(nombre, precio) {

    var tipo = tipo
        set(value) {
            val tipos = listOf("Bebidas","Legumbre","Verduras")
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