package MyOnlineShop

class Book : Product{
    var Sale_price = 0.0
    var publisher = ""
    var Year_published = 0
    constructor(regularPrice:Double, publisher : String, Year_published : Int):super(regularPrice){
        this.publisher = publisher
        this.Year_published = Year_published
    }
    override fun computeSalePrice(): Double {
        Sale_price = regularPrice * 0.5
        return Sale_price
    }
    override fun subtotal():Any{
        return "Item : Book \nPublisher : $publisher\nYear Published :$Year_published\nOriginal Price :$regularPrice \nDiscounted Price :$Sale_price \nID : $id"
    }

}