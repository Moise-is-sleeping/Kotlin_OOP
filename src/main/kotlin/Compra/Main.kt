package Compra

fun main() {
    val compra = Compra()

    while(true){
        println("Tipo de producto \n1) Percedero \n2) No Percedero \n3) Terminar")
        val a = readln().toInt()
        if (a == 1){
            print("Nombre : ")
            val b = readln()
            print("Precio : ")
            val c = readln().toDouble()
            print("Dias a caducar : ")
            val d = readln().toInt()
            val producto1 = Percedero(b,c,d)
            compra.comprar(producto1)
        }
        else if (a == 2){
            print("Nombre : ")
            val b = readln()
            print("Precio : ")
            val c = readln().toDouble()
            print("Tipo : ")
            val d = readln()
            val producto2 = NoPercedero(b,c,d)
            compra.comprar(producto2)
        }
        else{
            break
        }
    }
    while(true) {
        println("1) Editar Compra\n2) Comprar")
        val e = readln().toInt()
        if (e == 1) {
            compra.cambiarCantidad()
        } else {
            compra.Calcular()
            break
        }
    }
}