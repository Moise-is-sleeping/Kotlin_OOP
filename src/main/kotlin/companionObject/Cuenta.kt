package companionObject

class Cuenta(saldo : Int) {
    protected var saldo = 0
        set(value) {
            field = value
            if(value < 0)
                println("Estas en rojo !!")
        }

    var numeroCuenta = numero()



    companion object{
        var numerosDeCuentas = 21000000
    }
    init{
      this.saldo = saldo
    }
    fun verSaldo():Int{
        return saldo
    }
    fun recibirAbono(cantidad : Int){
        saldo += cantidad
    }

    fun pagar(cantidad : Int){
        saldo -= cantidad
    }
    fun numero():Int{
        numerosDeCuentas += 1
        return numerosDeCuentas
    }

}