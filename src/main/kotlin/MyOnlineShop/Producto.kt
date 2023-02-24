package MyOnlineShop

abstract class Product {

    var regularPrice:Double
    constructor(regularInitialPrice:Double){
        regularPrice=regularInitialPrice
    }
    abstract fun computeSalePrice():Double
    abstract fun subtotal()

}
