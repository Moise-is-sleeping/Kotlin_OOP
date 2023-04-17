package MyOnlineShop

abstract class Product {
    var id = idGenerator
    var regularPrice:Double
    constructor(regularInitialPrice:Double){
        regularPrice=regularInitialPrice
        idGenerator++
    }
    abstract fun computeSalePrice():Double
    abstract fun subtotal(): Any

    companion object{
        var idGenerator = 0
    }

}
