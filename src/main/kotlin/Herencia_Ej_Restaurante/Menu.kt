package Herencia_Ej_Restaurante

import kotlin.random.Random

class Menu {
    val IVA = 0.21
    var Descuento = Random.nextDouble(1.0,10.0)
    var Principal = ""
    var Bedida = 0
    var Postre = 0

    fun Menu(){
        print("\n---Principal---  \n\n* Entrecot (15€)\n* Pez Espada (12€)\n* Carrillada (10€)\n* Dorada (20€)\n* Otros (13€)\n-->")
        Principal = readln()
        print("\n---Bebidas---  \n\n1) Refresco (1€)\n2) Vino (1,5€\n3) Otros (2€) \n-->")
        Bedida = readln().toInt()
        print("\n---Postre--- \n\n1) Fruta (2€)\n2) Helado (3€)\n3) Otros (4€)\n-->")
        Postre = readln().toInt()

    }
    fun Importe(){
        var subtotal = 0.0
        subtotal += when(Principal){
            "Entrecot" ->   15.0
            "Pez Espada" ->  12.0
            "Carrillada" ->  10.0
            "Dorado" ->  20.0
            else ->  13.0
        }
        subtotal += when(Bedida){
            1 ->  1.0
            2 ->  1.5
            3 ->  2.0
            else -> 0.0
        }
        subtotal += when(Postre){
            1 ->  2.0
            2 ->  3.0
            3 ->  4.0
            else -> 0.0
        }
        subtotal += IVA
    }

}