/**
 *Funciones
 */

//Las funciones no se pueden escribir dentro de otras funciones, pero si se pueden invocar

fun main(args: Array<String>) {
	suma(10, 8)
    
    var resultado = sumita(10, 8)
    println(resultado)
    
    var cosenoUno = Math.cos(1.0)
    println(cosenoUno)
}

fun suma(a:Int, b:Int){
    print(a + b)
}

// Funcion que retorna un valor

fun sumita(a:Int, b:Int):Int{
    return a+b
}
