package ej_5_14
import kotlin.random.Random

class Product(var Product_name : String, var Price : Double) {
    private var Serial_number = Generate()

    var Product_Name = Product_name
        set(value) {
            if(value.isBlank()){
                field = pedir()
            }else{
                field = value
            }
        }

    var Precio = Price
    init {
        Product_Name =Product_name

    }


    fun pedir() : String{
        print("Please type a valid input !! --> ")
        val a  = readln()
        if (a.isBlank()){
           return  pedir()
        }
        return a
    }

    private fun Generate(): Int{
        val rand_digit = Random.nextInt(1,9999999)
        return rand_digit
    }

    fun Summary(){
        print("INFORME DE PRODUCTO \n------------------------------ \n<Nombre = ${Product_Name} > \n" + "<Serie = $Serial_number> \n" + "<Precio = $Precio>\n")
    }
    fun Compare(product: Product):Boolean{
        val product1 = product
        return if (product1.Product_Name == Product_Name){
            product1.Serial_number ==  Serial_number

        }else{
            false
        }

    }





}