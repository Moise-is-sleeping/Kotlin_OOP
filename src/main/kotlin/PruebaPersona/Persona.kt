package PruebaPersona

class Persona(private val cashSaving : Int, private val retirementFund: Int, private val firstName : String, private val lastName : String):PersonInterface, PersonInterface2{
    override fun computeTotalWealth():Int {
        return cashSaving + retirementFund
    }

    override fun getName():String {
        return "$firstName $lastName"
    }

    override fun measureIntelligence(name: String): String {
        if(name.startsWith("Micheal",false)){
            return "IQ = 150"
        }else{
            return "IQ = 50"
        }
    }
}