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
    override fun subtotal():Any{
        return "Item : MP3player \nColor:$color \nManufacturer : $manufacturer \nOriginal Price :$regularPrice \nDiscounted Price :$Sale_price \nID : $id"
    }

}