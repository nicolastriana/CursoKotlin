/*
 *Tipos de Datos: Characters, Strings
 */

fun main(args: Array<String>) {
    
    //Characters
    
    //var char: Char = 'a'
    //char = '\uFA10'
    var char: Char = '8'
    
    var charToInt: Int = char.toInt() - 48
    
    // Error -> var suma: Int = char + 8
    // Suma Enteros -> var suma: Int = charToInt + 8
    var suma = char + 8
    
    println(char)
    println(charToInt)
    println(suma)
    
    //Strings
    
    var cadena: String = "Nicolás"
    
    println(cadena[0])
    
}

