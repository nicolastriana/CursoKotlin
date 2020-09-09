/*
 *Estructuras de Control:
 *Introducción Operadores ariméticos, de comparación y lógicos
 */

fun main(args: Array<String>) {

    //Operadores Aritméticos -> + - / *
    
    var suma = 10 + 10
    var resta = 10 - 10
    var div = 10 / 10
    var mult = 10 * 10
    
	println(suma)
    println(resta)
    println(div)
    println(mult)
    println("------------------------------------------------")
    
    //Operadores de Comparación -> < > == <= >= !=
    
    var a = 5
    var b = 8
    
    println(a < b)
    println(a > b)
    println(a == b)
    println(a <= b)
    println(a >= b)
    println(a != b)
    println("------------------------------------------------")
    
    //Operadores Lógicos -> ! && ||
    
    var c = 8
    var d = 8
    var e = 7
    
    println(c == d && e > c)
    println(c == d && e < c)
    //             True       &&   False 
    println((c != d || e < c) && (d == e))
    //             True       ||   False 
    println((c != d || e < c) || (d == e))
    
}
