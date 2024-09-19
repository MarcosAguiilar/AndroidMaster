package com.example.androidmaster.syntaxis

fun main(){
    var name: String
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes","Sabado", "Domingo")

    //Consultar largura de una lista
    println(weekDays.size)

    //Comprobar si puedes acceder a una posicion de una lista
    if(weekDays.size >= 8){
        println(weekDays[7])
    }else{
        println("No hay ninguna valor en la posicion pedida.")
    }

    //Modificar valores de un array
    println(weekDays[0])
    weekDays[0] = "Monday"
    println(weekDays[0])

    //Bucles arrays
    for(position in weekDays.indices){
        println("$position")
        println(weekDays[position])
    }
    for((position, value) in weekDays.withIndex()){
        println("El $value tiene la posicion: $position")
    }
    for(value in weekDays){
        println("$value")
    }
}
