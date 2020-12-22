open class Fruta(){
    
    var color: String = ""
    var sabor: String = ""
    var precio: Int = 0
    var frescura: Int = 0
    
    /*init{
        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = frescura
    }*/
    
    
    constructor(color: String, sabor: String, precio: Int, frescura: Int):this() {
    	this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = frescura        
    }
    
    constructor(color: String, sabor: String, precio: Int):this() {
    	this.color = color
        this.sabor = sabor
        this.precio = precio        
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


class FrutaConGrasa(): Fruta() {
    
    var cantidadGrasa: Int = 0
    
    constructor(grasa: Int):this() {
        this.cantidadGrasa = grasa
    }
    
}


fun main(args: Array<String>) {
    
    var manzana = Fruta("Rojo", "Dulce", 4, 100)
    
    println(manzana.color)
    manzana.pudrirse()
    manzana.fresco()
    manzana.pudrirse()
    manzana.fresco()
    manzana.pudrirse()
    manzana.fresco()
    manzana.pudrirse()
    manzana.fresco()
    manzana.pudrirse()
    manzana.fresco()
    
    var pera = Fruta("Verde", "Dulce", 3)
    println(pera.color)
    
    var aguacate = FrutaConGrasa(10)
    aguacate.color = "Verde"
    aguacate.sabor = "Salado"
    aguacate.precio = 3
    aguacate.frescura = 60
    println(aguacate.cantidadGrasa)
    println(aguacate.color)
    println(aguacate.sabor)
    println(aguacate.frescura)
    aguacate.pudrirse()
    aguacate.fresco()
    
}
