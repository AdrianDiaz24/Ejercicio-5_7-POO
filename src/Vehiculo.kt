

abstract class Vehiculo(val marca: String, val modelo: String, val capacidadCombustible: Int) {

    fun calcularAutonomia(): Int{
        return capacidadCombustible * 10
    }

     abstract fun mostrarInfo()

}