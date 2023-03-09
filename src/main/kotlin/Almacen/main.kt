package Almacen

fun main (){
    val almacen = Almacen()
    val listaProdcuto = mutableListOf<Bebida>()
    val listaProdcuto2 = mutableListOf<Bebida>()
    val bebida1 = bebidaAzucaradavar(2.5,2,"Cocacola",2)
    val bebida2 = bebidaAzucaradavar(3.5,2,"Fanta",2)
    val bebida3 = AguaMineral(3.5,2,"Agua","Jerez")
    listaProdcuto.add(bebida1)
    almacen.anadirProductos(listaProdcuto)

    listaProdcuto2.add(bebida2)
    listaProdcuto2.add(bebida2)
    listaProdcuto2.add(bebida3)
    almacen.anadirProductos(listaProdcuto2)

    almacen.anadirUnProducto(bebida2)
    almacen.test()

//    almacen.borrarMarca("Agua")
//    almacen.test()

    almacen.borrarEstanteria(2)
    almacen.test()
////
//    println(almacen.calcularPrecioMarca())
//    println(almacen.calcularPrecioTotal())
//    almacen.calcularPrecioEstanteria()

}