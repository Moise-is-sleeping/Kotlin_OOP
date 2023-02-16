package Alquiler_Vehiculos

abstract class Vehiculo {
    var matricula = ""
        set(value) {
            if (matricula_valida()){
                field = value
            }else{
                print("Invalid Input !!")
            }

        }
    var duracion = 0

    constructor(matricula_1 : String, duracion_1:Int){
        this.duracion = duracion_1
        this.matricula = matricula_1
    }

    fun matricula_valida ():Boolean{
        return matricula.length == 7
    }
    abstract fun alquiler()
    abstract fun recibo()

}