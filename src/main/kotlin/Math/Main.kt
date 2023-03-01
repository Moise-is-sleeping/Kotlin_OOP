package Math

fun main(){
    val a = Line(2.2,3.5,4.6,5.7)
    val b = Line(2.2,3.5,4.6,5.7)
    if(a.isGreater(b.getLength())){
        print("a is greater than b")
    }
    else if(a.isEqual(b.getLength())){
        print("a is equals to b")
    }
    else if(a.isLess(b.getLength())){
        print("a is less than b")
    }
}