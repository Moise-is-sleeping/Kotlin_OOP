package MyOnlineShop

fun main(){
    val Samsung = TV(299.99,"Samsung",44)
    val Sony = TV(399.99,"Sony",44)
    val MP3player = MP3player(20.0,"Sony","Yellow")
    val book1 = Book(39.99,"Penguin books",1995)
    val book2 = Book(29.99,"Penguin books",1995)
    val shopping_cart = mutableListOf<Product>(Samsung,Sony,MP3player,book1,book2)
    var total = 0
    for (i in shopping_cart){
        i.subtotal()
        total
    }
}