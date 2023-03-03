package Almacen

fun main (){
    val almacen = Almacen()
    val listaProdcuto = mutableListOf<Bebida>()
    val bebida1 = bebidaAzucaradavar(2.5,2,"Cocacola",2)
    val bebida2 = bebidaAzucaradavar(3.5,2,"Fanta",2)
    listaProdcuto.add(bebida1)
    listaProdcuto.add(bebida2)
    almacen.anadirProducto(listaProdcuto)
//    println(almacen.calcularPrecioMarca())
//    println(almacen.calcularPrecioTotal())
    almacen.calcularPrecioEstanteria()

}