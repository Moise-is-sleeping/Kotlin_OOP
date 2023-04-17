package MyOnlineShop

import java.io.File

fun main(){
    val cesta = mutableListOf<Product>()




    fun comprar(){
        print("Nombre Producto : ")
        val a = readln()
        if (a == "TV"){
            print("Precio : ")
            val b = readln().toDouble()
            print("Compañia : ")
            val c = readln()
            print("Tamaño : ")
            val d = readln().toInt()
            val Samsung = TV(b,c,d)
            Samsung.subtotal()
            cesta.add(Samsung)
        }
        else if (a == "Book"){
            print("Precio : ")
            val b = readln().toDouble()
            print("Publicador : ")
            val c = readln()
            print("Año publicado : ")
            val d = readln().toInt()
            val book1 = Book(b,c,d)
            book1.subtotal()
            cesta.add(book1)
        }
        else if (a == "MP3player"){
            print("Precio : ")
            val b = readln().toDouble()
            print("Compañia : ")
            val c = readln()
            print("Color : ")
            val d = readln()
            val MP3player = MP3player(b,c,d)
            MP3player.subtotal()
            cesta.add(MP3player)
        }

    }

    fun editarProducto(){
        print("Id Del producto : ")
        val a = readln().toInt()
        for(item in cesta){
            if(item.id == a){
                print("Nuevo Precio : ")
                val b = readln().toDouble()
                item.regularPrice = b
            }else{
                print("Producto no exsite !!")
            }
        }
    }
    fun borrar(){
        print("Id Del producto : ")
        val a = readln().toInt()
        for(item in cesta){
            if(item.id == a){
                cesta.remove(item)
                break
            }
        }
    }

    while (true) {
        println("1) Añadir Producto \n2) Editar producto \n3) Borrar\n4)Terminar  ")
        val a = readln().toInt()
        when (a) {
            1 -> comprar()
            2 -> editarProducto()
            3 -> borrar()
            4 -> {
                val file = File("Productos.txt")
                var a = ""
                for(items in cesta){
                    a += items.subtotal()

                }
                file.printWriter().use {
                    it.println(a)
                }
                break
            }
        }

    }



}