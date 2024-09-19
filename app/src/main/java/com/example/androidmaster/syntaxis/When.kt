package com.example.androidmaster.syntaxis

fun main(){

}
fun result(value:Any){
    val result = when (value){
        is Int -> println("Integer")
        is String -> println("String")
        is Boolean -> println("Boolean")
        else -> println("None")
    }
}

fun getSemester(month:Int){
    when(month){
        in 1..6 -> println("Primer semestre")
        in 7..12 -> println("Segundo semestre")
        !in 1..12 -> println("Semestre no válido")
    }
}


fun getTrimester(month:Int){
    when(month){
        1,2,3 -> println("Primer trimestre")
        4,5,6 -> println("Segundo trimestre")
        7,8,9 -> println("Tercer trimestre")
        10,11,12 -> println("Cuarto trimestre")
        else -> println("Trimestre no válido")
    }


}

fun getMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> {
            println("Diciembre")
            println("Diciembre")
        }
        else -> println("El mes no es válido")
    }
}

