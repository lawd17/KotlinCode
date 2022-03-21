//parametro varang
fun getDays(mensaje:String, vararg dias: String){
    dias.forEach { value -> 
        println("$mensaje $value")
    }
}

fun main() {
//array
    val daysArray = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    
    println(daysArray.size)
    println(daysArray[0])
    println(daysArray.get(0))

    for (value in daysArray) {
        println(value)
    }

    daysArray.forEach {
        println(it) 
    }

    daysArray.forEach { value -> 
        println(value) 
    }

    daysArray.forEachIndexed { index, value ->
        println("$value is at index $index")
    }

//list
    val daysList = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
   
    daysList.forEach { value -> 
        println(value) 
    }

//map
    val daysMap = mapOf(1 to "Lunes", 2 to "Martes", 3 to "Miercoles")
    daysMap.forEach { key, value -> 
        println("$key -> $value")
    }

//todos estas colecciones anteriores son inmutables, es decir que no podemos añadir, borrar o modificar
//Para poder crear una collecion que podamos modficiar realizamos lo siguiete
val mutableList = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
val mutableMap = mutableMapOf(1 to "Lunes", 2 to "Martes", 3 to "Miercoles")

//uso de funcion varang
getDays("Es ", "Lunes", "Martes", "Miercoles", "Jueves")

//pero que pasa si le pasamos un array
getDays("Es ", daysArray)//si lo ponemos culquier coleccion nos data un erro

//para solucionarlo añadimos un * antes de la variable
//con esto compilador lo acepta (solo funciona para arrays)
getDays("Es ", *daysArray)//si lo ponemos culquier coleccion nos data un erro

}

