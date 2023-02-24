package MyOnlineShop

class Camera : Electronics{
    var Sale_price = 0.0
    constructor(regularPrice:Double, manufacturer : String):super(regularPrice, manufacturer){

    }
    override fun computeSalePrice(): Double {
        Sale_price = regularPrice * 0.7
        return Sale_price
    }

    override fun subtotal(){
        println("Item : Camera \nManufacturer : $manufacturer")
        println("Original Price :$regularPrice")
        println("Discounted Price :$Sale_price")
    }
}