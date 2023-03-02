package Almacen

class Almacen {
    var almacen = mutableMapOf<Int,MutableList<Bebida>>()


    fun añadirProducto(estanteria : Int, list : MutableList<Bebida>){
        almacen.put(estanteria,list)
    }

    fun calcularPrecioTotal(): Double{
        var total = 0.0
        for((key, value)in almacen){
            for(item in value){
                print("Cantidad : ")
                total += item.calcular(readln().toInt())
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

}