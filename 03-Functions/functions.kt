//Funcion con parametro
fun calcularDoble(numero: Int): Int {
    return numero * 2
}   

/*
Si le ponemos a la funcion que devuelve "Unit" significa que 
esta no va a devolver nada algo como "void" en otros lenguajes 
*/
fun mostrarNumero(numero: Int): Unit{
    println(numero)
}

//Single expresion function. Esta funcion devule un literal que en esta caso es un numero
fun devolverNumeroDos(): Int  = 2

//funcion que usa $ dentro para llamar a variable
fun calcularTriple(numero: Int): String {
    var triple = numero * 3
    var resultado = "El triple de $numero es $triple"
    
    return resultado
}

//podemos coloclar valores por defecto en la funcion
fun sumar(primerNumero: Int = 0, segundoNumero: Int = 0) = primerNumero - segundoNumero

fun main() {
    val numero: Int = 5;

    mostrarNumero(numero)
    println(devolverNumeroDos()) 
    println(calcularDoble(numero))
    println(calcularTriple(numero))

    //a la hora de llamar a una funcion podemos declara las variables directamente
    sumar(primerNumero = 5, segundoNumero = 10)

    //al hacer esto podemos colocar los parametros en culquier orden
    sumar(segundoNumero = 5, primerNumero = 10)

    
}

