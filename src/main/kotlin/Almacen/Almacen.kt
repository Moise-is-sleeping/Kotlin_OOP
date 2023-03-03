package Almacen

class Almacen {
    var almacen = mutableMapOf<Int,MutableList<Bebida>>()
    var numEstanteria = 1


    fun anadirProducto(list : MutableList<Bebida>){
            almacen.put(numEstanteria,list)
            numEstanteria += 1

    }

    fun calcularPrecioTotal(): Double{
        var total = 0.0
        for((key, value)in almacen){
            for(item in value){
                total += item.calcular(1)
            }
        }
        return total
    }

    fun calcularPrecioMarca():Double{
        var total = 0.0
        print("Marca : ")
        val Input = readln()
        for((key, value)in almacen){
            for(item in value){
                if(item.marca == Input){
                    print("Cantidad : ")
                    total += item.calcular(readln().toInt())
                }
            }
        }
        return total
    }
    fun calcularPrecioEstanteria(){
        print("Numero de estanteria : ")
        val a = readln().toInt()
        var total = 0.0
        for((key,value) in almacen){
            if(a == key){
                for(item in value){
                    total += item.precio
                }
            }
        }
        print("Precio total : $total")

    }

}