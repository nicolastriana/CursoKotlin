/**
 *Estructuras de Control:
 *Introducción Operadores ariméticos, de comparación y lógicos
 */

fun main(args: Array<String>) {
    
    var a = 5
    var b = 3 
    var c = -12
    
    println((a != b || c < a) || (b == c))
    println(a > 3)
    println(a > b)
    println(a < c)
    println(c < b)
    println(b != a)
    println(a == 8)
    println(b * c == 18)
    println(a * b == - 30)
    println(c / b < a)
    println(c / b == -11)
    println(c / b == - 4)
    println(a + c + b == 5)
    println((a + b == 8) && (a - b == 2))
    println((a + b == 8) || (a - b == 6))
    println(a > 3 && b > 4 && c < 3)
    println(a > 3 && b >= 3 && c < -3)
    
}

/**
 * a > 3 | True 
 * a > b | True
 * a < c | False
 * c < b | True
 * b != a | True
 * a == 8 | False
 * b * c == 18 | False
 * a * b == - 30 | False
 * c / b < a | True
 * c / b == -11 | False
 * c / b == - 4 | True
 * a + c + b == 5 | False
 * (a + b == 8) && (a - b == 2) | True
 * (a + b == 8) || (a - b == 6) | True
 * a > 3 && b > 4 && c < 3 | False
 * a > 3 && b >= 3 && c < -3 | True
 */
