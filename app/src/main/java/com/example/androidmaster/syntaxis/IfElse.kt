package com.example.androidmaster.syntaxis

fun main(){
    ifBasic()
}

fun ifAnidado(){

}

fun ifBasic(){
    val name = "Marcos"
    val animal = "dog"


    if (name == "Marcos"){
        println("Correcto")
    }else{
        println("Incorrecto")
    }

    if (name[0].lowercaseChar() == 'm'){
        println("Correcto")
    }else{
        println("Incorrecto")
    }

    if(animal == "dog"){
        println("Es un perro!")
    }else if(animal == "cat"){
        println("Es un gato!")
    }else if(animal == "bird"){
        println("Es un pajaro!")
    }else{
        println("No es un animal esperado.")
    }
    var soyFeliz:Boolean = true
    if(!soyFeliz){
        println("Estoy triste :(")
    }
    var age: Int = 29
    var parentsPermision = true

    if(age >= 18){
        println("puedes tomarte una cerveza")
    }else{
        println("no puedes tomarte una cerveza")
    }

    if(age >= 18 && parentsPermision && soyFeliz){
        println("puedo beber cerveza")
    }

    if(age>=18 || parentsPermision){
        println("Puedo beber cerveza")
    }
}