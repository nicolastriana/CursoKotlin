/*
 *Tipos de Datos: Strings con secuencias de escape y String puros (raw strings)
 */

fun main(args: Array<String>) {
    
    //var cadena: String = "Nicolás\n\tTriana"
    
    var cadena: String = """Nicolás \n \t
    						Triana"""
    
    var cadena1: String = "Nicolás"
    var cadena2: String = "Triana"
    
    var dinero: Int = 10
    
    println(cadena.length)
    println(cadena1 + cadena2)
    println("Mi nombre es: $cadena1 y tiene ${cadena1.length} caracteres y tengo ${'$'}$dinero dolares")
    
}
