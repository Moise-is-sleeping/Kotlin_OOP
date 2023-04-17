package MyOnlineShop

import java.io.File

fun main(){

        val file = File("Productos.txt")
        print(file.readLines())

}