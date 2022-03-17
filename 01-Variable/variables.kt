fun main() {
    //con val se declaran variables inmutables "final"
    val name_val: String = "Juan"
    //name_val = "" //esto falla por que es inmutable

    //con var declaramos variable mutables
    var name_var: String = "Jonay"
    name_var = "Pedro" // esto si funcion

    println(name_val)
    println(name_var)

    //podemos añadir una interrogación para poder declarar la variable como nula, de otra forma no nos dejaria
    var surnames: String? = "Hernandez"
    println(surnames)

    surnames = null
    println(surnames)


    //kotline detecta que tipo de datos es la variable
    var greeting = "hello"
    //greeting = null //esto no funcionaria por que ya detecto que esta varaible es de tipo string
 
}