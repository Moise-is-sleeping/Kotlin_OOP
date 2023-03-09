package Compra

class Compra {

    var ListCompra = mutableMapOf<Producto,Int>()

    fun comprar(Producto : Producto){
        print("Cantidad de ${Producto.nombre} : ")
        val cantidad = readln().toInt()
        ListCompra.put(Producto,cantidad)
    }

    fun Calcular(){
        var total = 0.0
        for((keys,values) in ListCompra){
            total += keys.calcular(values)
        }
        for((keys,value ) in ListCompra){
            keys.info()
            println("Cantidad : $value")
        }
        println("total : $total")
    }

    fun cambiarCantidad(){
        print("Nombre de producto : ")
        val a = readln()
        for((keys,values) in ListCompra){
            if(keys.nombre == a){
                print("Nueva Cantidad : ")
                ListCompra.replace(keys, readln().toInt())
            }
        }
    }
}