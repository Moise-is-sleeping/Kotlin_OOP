package companionObject

fun main(){
    val person1 = Persona("7zsd8f8")
    person1.crearCuentas()
    print("1) Infomacion sobre Cuentas \n2) Transferencia")
    val Input = readln().toInt()
    when(Input){
        1 -> person1.infoCuentas()
        2 -> {
                print("Numero de Cuenta :")
                val a = readln().toInt()
                print("Cantidad :")
                person1.transferencia(a,readln().toInt())
            }
    }

}