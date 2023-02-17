package Alquiler_Vehiculos

class Bus :VehiculoTransporte{
    constructor(matricula_1 : String,duracion_1: Int, plaza_1 : Int ):super(matricula_1 , duracion_1, plaza_1){

    }

    override fun alquiler() :Double{
        val total = (50* duracion) + ((2.0 * plaza)*50)
        return total
    }

    override fun recibo() {
        println("Matriclua : $matricula\nDuracion : $duracion\nPlazas : $plaza\ntTipo : Coche\n Importe : ${alquiler()}")
    }
}