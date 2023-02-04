package ej_5_14

class Pedido {

    val rice = Product("Rice", 50.95)
    val Sausages = Product("Sausages", 35.5)
    val Chicken = Product("Chicken", 95.5)

    var P_List = mutableListOf<Product>()

    fun Order(){
        var x = 0
        while(x < 3){
            print("1) Rice\n2) Sausages\n3) Chicken \n4) Order\n=> ")
            val a = readln().toInt()
            if(a == 1){
                println("Rice has been added to cart")
                P_List.add(rice)
                x += 1
            }
            else if(a ==2){
                println("Susages have been added to cart")
                P_List.add(Sausages)
                x += 1
            }
            else if(a ==3){
                println("Chicken has been added to cart")
                P_List.add(Chicken)
                x += 1
            }
            else if(a ==4){
                break
            }
            else{
                println("Invalid Input !!")
            }

        }

    }

    fun total(){
        for(item in P_List){
            item.Summary()
        }
        if(P_List[0].Compare(P_List[2])){
            println("El Primer y ultimo producto son iguales")
        }
    }
}