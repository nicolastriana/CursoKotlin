class Fruta(color: String, sabor: String, precio: Int, frescura: Int){
    
    var color: String = ""
    var sabor: String = ""
    var precio: Int = 0
    var frescura: Int = 0
    
    init{
        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = frescura
    }
    
    
    fun pudrirse() {
        this.frescura -= 20
        println("La fruta se esta pudriendo")
    }
    
    
    fun fresco() {
        if(this.frescura >= 20) {
        	println("A la fruta le queda un " + this.frescura + "% de frescura")    
        }else{
            println("La fruta esta podrida")
        }
    }
    
}
