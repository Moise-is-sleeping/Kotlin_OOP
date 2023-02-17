package Alquiler_Vehiculos

class Camion:VehiculaCarga {
    constructor(matricula_1 : String, duracion_1:Int, tara_1 :Double) :super(matricula_1, duracion_1,tara_1){

    }
    override fun alquiler():Double{
        val total = (50*duracion)+(tara*20)+40
        return total
    }

    override fun recibo(){
        println("Matriclua : $matricula\nDuracion : $duracion\nToneladas : $tara\ntTipo : Coche\n Importe : ${alquiler()}")
    }
}