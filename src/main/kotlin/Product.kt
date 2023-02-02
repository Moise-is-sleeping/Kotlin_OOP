import kotlin.random.Random

class Product(var Product_Name : String, var Price : Double ) {
    private var Serial_number = Generate()
    init {
        while (true){
            if (Product_Name.length < 1){
                print("Input valid Name => ")
                Product_Name = readln()
            }
            else if(Price < 0.0){
                print("Input valid Price => ")
                Price = readln().toDouble()
            }else{
                break
            }
        }
    }

    private fun Generate(): Int{
        val rand_digit = Random.nextInt(1,9999999)
        return rand_digit
    }

    fun Summary(){
        print("INFORME DE PRODUCTO \n------------------------------ \n<Nombre = ${Product_Name} > \n" + "<Serie = $Serial_number> \n" + "<Precio = $Price>\n")
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