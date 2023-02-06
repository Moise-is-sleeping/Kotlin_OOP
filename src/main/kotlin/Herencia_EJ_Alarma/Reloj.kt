package Herencia_EJ_Alarma

open class Reloj {
    var hora = 0
    var minuto = 0
        set(value) {
            if (value > 59){
                field = value%60
                hora += value/60
            }else{
                field = value
            }
        }
    var segundo = 0
        set(value) {
            if (value > 59){
                field = value%60
                minuto += value/60
            }else{
                field = value
            }
        }


    fun Set_Time(Hora : Int, Minuto : Int, Segundo : Int ){
        hora = Hora
        minuto =  Minuto
        segundo = Segundo
    }



    fun Display():String{
        return "$hora : $minuto : $segundo "
    }

    fun tictac(){
        segundo += 1
    }

}