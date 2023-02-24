package MyOnlineShop

class MP3player:Electronics{
    var Sale_price = 0.0
    var color = ""
    constructor(regularPrice:Double, manufacturer : String, color : String):super(regularPrice,manufacturer){
        this.color = color
    }

    override fun computeSalePrice(): Double {
        Sale_price = regularPrice * 0.9
        return Sale_price
    }
    override fun subtotal(){
        println("Item : MP3player \nColor:$color \nManufacturer : $manufacturer")
        println("Original Price :$regularPrice")
        println("Discounted Price :$Sale_price")
    }

}