package Almacen

class Almacen {
    var almacen = mutableMapOf<Int,MutableList<Bebida>>()
    var numEstanteria = 1


    fun test(){
        for((key,value) in almacen){
            print(key)
            println(value)
        }
    }

    fun anadirUnProducto(producto : Bebida){
        var estanteriaMasVacida = almacen.values.first().size
        var Key = almacen.keys.first()
        for((key,value ) in almacen){
            if(value.size < estanteriaMasVacida) {
                estanteriaMasVacida = value.size
                Key = key
            }
        }
        almacen.getValue(Key).add(producto)
    }

    fun anadirProductos(productos : MutableList<Bebida>){
        almacen.put(numEstanteria,productos)
        numEstanteria ++

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

    fun borrarMarca(Marca : String){
        var counter = 0
        for((key,value) in almacen){
            for(item in value){
                if(item.marca == Marca){
                    value.remove(item)
                    counter += 1

                }
            }
        }
        print("$counter productos han sido borrados")
    }

    fun borrarEstanteria(estanteriaBorrar : Int){
        val estanteriaValores = almacen.getValue(estanteriaBorrar)
        var counter = 0
        almacen.remove(estanteriaBorrar, almacen.getValue(estanteriaBorrar))
        for(item in estanteriaValores){
            anadirUnProducto(item)
        }


    }


}