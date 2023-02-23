package Alquiler_Vehiculos

abstract class Vehiculo {
    var matricula = ""
        set(value) {
            if (value.length != 7){
                field = matricula_valida()
            }else{
                field = value
            }

        }
    var duracion = 0

    constructor(matricula_1 : String, duracion_1:Int){
        this.duracion = duracion_1
        this.matricula = matricula_1
    }

    fun matricula_valida ():String{
       println("Matricula debe tener 7 digitos : ")
       val a = readln()
       if (a.length != 7 ) {
           matricula_valida()
       }
        return a
    }
    abstract fun alquiler():Double
    abstract fun recibo()

}