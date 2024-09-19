package com.example.androidmaster.syntaxis

//VARIABLES
val name: String = "Marcos Aguilar"

fun main(){
    showMyName()
    showMyAge(23)
    showMyAge()
    add(30,40)
    val mySubtract = subtract(30,5)
    println(mySubtract)
}


fun showMyName(){
    println("$name")
}

fun showMyAge(curretAge:Int = 20){
    println("Tenog $curretAge años")
}

fun add(firstNum:Int, secondNum:Int){
    println(firstNum + secondNum)
}

fun subtract(firstNum:Int, secondNum:Int):Int{
    return firstNum - secondNum
}

fun subtractCool(firstNum:Int, secondNum:Int) = firstNum - secondNum


fun variablesNumericas(){

    /**Variables numericas*/

    //Integer -2147483647 a 2147483647
    val age: Int = 30

    //Long -9223372036854775807 a 9223372036854775807
    val num: Long = 30

    //Float
    val folatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 323.3333311

    print("Sumar:")
    println(age + num)

    print("Restar:")
    println(age - num)

    print("Dividir:")
    println(age / num)

    print("Multiplicar:")
    println(age * num)

    print("Modulo:")
    println(age % num)
}

fun variablesBoolean(){

    /**Variables booleanas*/

    //Boolean
    var boolExample: Boolean = true
    var boolExample1: Boolean = false
}
fun variablesAlphanumericas(){
    /**Variables alphanumerical*/

    //Char
    var charExample1: Char = '2'
    var charExample2: Char = 'e'
    var charExample3: Char = '@'

    //String
    var stringExample: String = "Hola que tal, como estas?"

    val fraseConcat = "Hola, soy $name"
    print(fraseConcat)
}