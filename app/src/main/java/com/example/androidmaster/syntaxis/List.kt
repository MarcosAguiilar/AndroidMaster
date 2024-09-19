package com.example.androidmaster.syntaxis

fun main(){
    val readOnly:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes","Sabado", "Domingo")

    //Ultimo valor de la lista
    println(readOnly.last())

    //Primer valor de la lista
    println(readOnly.first())

    //Filtrar una lista
    val example = readOnly.filter { it.contains("a") }
    println(example)

    //Recorrer una lista
    readOnly.forEach { println(it) }

    //Añadir elementos a una lista
    readOnly.add("Nuevo dia")
    println(readOnly)
}