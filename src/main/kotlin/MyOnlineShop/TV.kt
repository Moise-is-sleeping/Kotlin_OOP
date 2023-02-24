package MyOnlineShop

class TV: Electronics {
    var size = 0
    var Sale_price = 0.0
    constructor(regularPrice:Double, manufacturer : String, size: Int ):super(regularPrice,manufacturer){
        this.size = size
    }

    override fun computeSalePrice(): Double {
        Sale_price = regularPrice * 0.8
        return Sale_price
    }
    override fun subtotal(){
        println("Item : TV \nSize:$size \nManufacturer : $manufacturer")
        println("Original Price :$regularPrice")
        println("Discounted Price :$Sale_price")
    }
}