package Alquiler_Vehiculos

class Alquiler : ALquilable {
        var lista_pedidos = mutableListOf<Vehiculo>()
        var total = 0.0

        fun menu(){
            println("Tipo de vehicula a alquilar: \n1) Coche\n2) Bus\n3) Camion \n4) Furgoneta")
            val type = readln().toInt()
            when(type){
                1 ->{
                    println("Matricula, Numero de dias, Numero de Plazas")
                    lista_pedidos.add(Coche(readln(), readln().toInt(), readln().toInt()))

                }
                2 -> {
                    println("Matricula, Numero de dias, Numero de Plazas")
                    lista_pedidos.add(Bus(readln(), readln().toInt(), readln().toInt()))
                }
                3 -> {
                    println("Matricula, Numero de dias, Numero de Toneladas")
                    lista_pedidos.add(Camion(readln(), readln().toInt(), readln().toDouble()))
                }
                4 -> {
                    println("Matricula, Numero de dias, Numero de Toneladas")
                    lista_pedidos.add(Furgoneta(readln(), readln().toInt(), readln().toDouble()))
                }
            }
        }

         override fun importeTotal(){
            for (i in 0 until lista_pedidos.size){
                lista_pedidos[i].recibo()
                total += lista_pedidos[i].alquiler()
            }
             print("Precio total :$total")
        }

}