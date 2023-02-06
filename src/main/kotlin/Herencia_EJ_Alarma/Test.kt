package Herencia_EJ_Alarma

fun main(){
    val watch = Reloj()
    val alarm = `Reloj-Alarma`()
    watch.Set_Time(18,35,61)
    alarm.Set_Alarma(18,52)
    for (x in 1 ..1000){
        watch.tictac()
        if (watch.hora == alarm.horaAlarma && watch.minuto == alarm.minutoAlarma){
            print("Ring Ring mother fucker !!")
        }
        println(watch.Display())
    }

}