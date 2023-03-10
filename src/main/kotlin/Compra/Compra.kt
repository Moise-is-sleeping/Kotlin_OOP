package Compra

class Compra {

    var ListCompra = mutableMapOf<Producto,Int>()
    var listProductoIgual = mutableMapOf<Producto,Int>()
    fun comprar(Producto : Producto){
        print("Cantidad de ${Producto.nombre} : ")
        val cantidad = readln().toInt()
        ListCompra.put(Producto,cantidad)
    }

    fun cantidadProducto(producto: Producto){
        var counter = 0
        for((key,value) in ListCompra){
                if (key.nombre == producto.nombre) {
                    counter += value
                    ListCompra.replace(key,0)
                    listProductoIgual.put(key,value)
            }
        }

        ListCompra.replace(producto,counter)
    }


    fun Calcular(){
        var total = 0.0
        for((key,values) in ListCompra){
            cantidadProducto(key)

        }

        for((keys,value ) in ListCompra){
            if(value != 0) {
                keys.info()
                total += keys.calcular(value)
                println("Cantidad : $value")
            }
        }
        println("total : $total")

        for((key,value) in listProductoIgual){
            if(value == 0)
                ListCompra.remove(key,value)
        }
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