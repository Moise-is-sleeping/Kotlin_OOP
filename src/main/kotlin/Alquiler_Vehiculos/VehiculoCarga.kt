package Alquiler_Vehiculos

abstract class VehiculaCarga : Vehiculo{
    var tara = 0.0

    constructor(matricula_1 : String, duracion_1:Int, tara_1 :Double) :super(matricula_1, duracion_1){
        this.tara = tara_1
    }
    abstract override fun alquiler()
    override fun recibo(){
        println("Matriclua : $matricula\nDuracion : $duracion\nTara : $tara\nImporte : ")
    }

}
