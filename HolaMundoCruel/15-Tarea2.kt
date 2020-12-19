/**
 *Tarea: Imprimir los primeros 18 números de la serie Fibonacci en consola utilizando todo lo aprendido hasta el momento.
 */

fun main(args: Array<String>) {
	
    var a = 0
    var b = 1
    var sum = 0
    var cont = 0
    
    for(l in 1..18){
    	cont++
        sum = a + b
        if(cont % 2 == 0){
            a = sum
        }else{
            b = sum
            if(cont == 1){
                println(0)
            }
        }
        println(sum)
    }

}

