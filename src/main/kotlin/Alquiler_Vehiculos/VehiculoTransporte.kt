package Alquiler_Vehiculos

abstract class VehiculoTransporte: Vehiculo{
    var plaza = 0
    constructor(matricula_1 : String,duracion_1: Int, plaza_1 : Int ):super(matricula_1 , duracion_1){
        this.plaza = plaza_1
    }
    abstract override fun alquiler()
    override fun recibo(){
        println("Matriclua : $matricula\nDuracion : $duracion\nPlazas : $plaza\nImporte : ")
    }

}