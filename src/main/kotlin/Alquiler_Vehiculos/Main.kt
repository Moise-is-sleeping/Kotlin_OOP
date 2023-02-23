package Alquiler_Vehiculos

fun main(){
    val person_1 = Alquiler()
    println("Numero de Vehiclos para alquilar :")
    for (i in 0..readln().toInt()){
        person_1.menu()

    }
    person_1.importeTotal()


}