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
    override fun subtotal():Any {
        return "Item : TV \nSize:$size \nManufacturer : $manufacturer \nOriginal Price :$regularPrice \nDiscounted Price :$Sale_price \nID : $id"
    }



}