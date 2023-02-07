package ej_5_15
val tiempo = Time(0,0,0)
fun main(){
    while (true) {
        println("1) Show 24 hour time \n2) Show 12 hour time \n3) Modify Hours\n4)Modify Minutes\n5) Modify Seconds \n6) End Porgram ")
        val Input = readln().toInt()

        when (Input) {
            1 -> tiempo.mostrarhora24()
            2 -> tiempo.mostrarhora12()
            3 -> {
                print("Input the hour --> ")
                tiempo.hour = readln().toInt()
            }

            4 -> {
                print("Input the minute --> ")
                tiempo.minute = readln().toInt()
            }

            5 -> {
                print("Input the second --> ")
                tiempo.second = readln().toInt()
            }

            6 -> break
        }
    }

}