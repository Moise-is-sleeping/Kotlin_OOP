package PruebaPersona

fun main() {

    val person1 = Persona(2000,5000,"Micheal","Myers")
    println(person1.getName())
    println(person1.computeTotalWealth())
    println(person1.measureIntelligence(person1.getName()))
}