/**
 *Estructuras de Control:
 *If Else
 */

fun main(args: Array<String>) {
    
	var a = 123
    var b = 11
    var c = 5
    var numeroMayor: Int
    
    // Primera Forma
    if(a > b){
    	println("La variable a es mayor a la variable b")
    }else{
        println("La variable b es mayor a la variable a")
    }
    
    // Segunda Forma
    if(a > b) println("La variable a es mayor a la variable b") else println("La variable b es mayor a la variable a")
    
    // Ejercicio
    numeroMayor = if(a>b && a>c) a else if(b>a && b>c) b else c
    println("El numero mayor de todas mis variables es: $numeroMayor")
    
}
