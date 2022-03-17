var greeting: String? = null

fun main() {
    val name = "jonay"
//if sentence
    println("--If sentence--")
    if(greeting != null){
        println(greeting)
    } else {
        println("Hi")
    }

    println(name)
//when expression (switch)
    println("--when expression (switch)--")

    when(greeting){
        null -> println("Hi")
        else -> println(greeting)
    }

    println(name)

    //igualar un if a una variable
    println("--Asignar un if a una variable--")
    val greetingToPrintIf = if(greeting != null) greeting else "Hi"
    println(greetingToPrintIf)
    println(name)

    //igualar un when a una variable
    println("--Asignar un when a una variable--")
    val greetingToPrintWhen = when(greeting){
        null -> "Hi"
        else -> greeting
    }

    println(greetingToPrintWhen)
    println(name)

}