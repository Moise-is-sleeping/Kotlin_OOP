package Alquiler_Vehiculos

class Coche: VehiculoTransporte {

    constructor(matricula_1 : String,duracion_1: Int, plaza_1 : Int ):super(matricula_1 , duracion_1, plaza_1){

    }

    override fun alquiler() :Double{
        val total = (50* duracion) + ((1.5 * plaza)*50)
        return total
    }

    override fun recibo() {
        println("*****COCHE*****\n" +
                "\nMatriclua : $matricula\nDuracion : $duracion\nPlazas : $plaza\nTipo : Vehiculo Tranporte\nImporte : ${alquiler()}")
    }
}