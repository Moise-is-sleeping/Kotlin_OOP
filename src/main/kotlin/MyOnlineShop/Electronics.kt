package MyOnlineShop

abstract class Electronics :Product{
    var manufacturer = ""
    constructor(regularPrice:Double, manufacturer : String):super(regularPrice){
        this.manufacturer = manufacturer
    }

}