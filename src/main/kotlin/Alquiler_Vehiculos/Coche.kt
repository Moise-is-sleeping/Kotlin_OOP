package Alquiler_Vehiculos

class Coche: VehiculoTransporte {

    constructor(matricula_1 : String,duracion_1: Int, plaza_1 : Int ):super(matricula_1 , duracion_1, plaza_1){
 9
    }

    override fun alquiler() {
        TODO("Not yet implemented")
    }

    override fun recibo() {
        println("Matriclua : $matricula\nDuracion : $duracion\nPlazas : $plaza\ntTipo : Coche\n Importe : ")
    }
}