package ej_5_15

class Time(var Hora : Int, var Minuto: Int, var Segundo: Int) {
    var hour: Int = 0
        set(value) {
            field = value
            field = Hora + (Minuto/60) + ((Segundo/60)/60)
            if (field > 23){
                field %= 24
            }
        }
    var minute: Int = 0
        set(value) {
            field = Minuto + Segundo/60
            if (field > 59){
                field %= 60
            }
        }
    var second: Int = 0
        set(value) {
            field = Segundo
            if (field > 59){
                field %= 60
            }
        }
    init {
        second = Segundo
        minute = Minuto
        hour = Hora


    }

    fun mostrarhora24(){
        println("The time is $hour:$minute:$second")
    }
    fun mostrarhora12(){
        var hour_2 = hour
        var D_N = ""
        if (hour_2 > 12){
            hour_2 %= 12
            D_N = "Pm"
        }else{
            D_N = "Am"
        }
        println("The time is $hour_2:$minute:$second $D_N")
    }



    override fun toString(): String {
        return "Hora(hour=$hour, minute=$minute, second=$second)"
    }


}