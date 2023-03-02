package companionObject

class Persona(var DNI : String) {
    var listaCuentas = mutableListOf<Cuenta>()
     fun crearCuentas(){
        for(i in 1..3){
            val cuenta = Cuenta(1000)
            listaCuentas.add(cuenta)
        }
    }
    fun infoCuentas(){
        for(cuenta in listaCuentas){
            println("Numero Cuenta = ${cuenta.numeroCuenta} \nSaldo = ${cuenta.verSaldo()}")
        }
    }
    fun transferencia(Numero_cuenta : Int, cantidad : Int){
        println("1) Ingresar \n2) Enviar")
        val accion = readln().toInt()
        for(cuenta in listaCuentas){
            if (cuenta.numeroCuenta == Numero_cuenta){
                when(accion){
                    1 -> cuenta.recibirAbono(cantidad)
                    2 -> {
                        cuenta.pagar(cantidad)
                        for(account in listaCuentas){
                            if (account.numeroCuenta == Numero_cuenta){
                                account.recibirAbono(cantidad)
                            }                            }
                    }

                }
            }
        }
    }



}