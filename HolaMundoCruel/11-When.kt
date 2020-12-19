/**
 *Estructuras de Control:
 *When
 */

fun main(args: Array<String>) {

    val calificacion = 1
    var resena: String
    
    // NO solo se pueden utilizar enteros, tambien se puede hacer con caracteres, Ej: 'A', 'B', 'C', etc.
    
    when (calificacion){
        
        //in 1..5 -> {println("El cliente califico con $calificacion estrellas")
        //		  resena = "Mediocre"}
        1 -> resena = "No me gusto la comida, me causo malestar"
        2 -> resena = "No me gusto, pero la bebida si"
        //2,3,4 -> {println("El cliente califico con $calificacion estrellas")
        		  resena = "Mediocre"}
        4 -> resena = "Me gusto pero puede mejorar"
        5 -> resena = "La mejor comida mexicana en mucho tiempo"
        else -> resena = "Reseña mal escrita"
        
    }
    
    /**when {
        
        calificacion >= 1 -> {println("El cliente califico con $calificacion estrellas")
        		  			  resena = "Mediocre"}
        else -> resena = "Reseña mal escrita"
        
    }**/
    
    print(resena)
}
