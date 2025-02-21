class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int, cilindrada: Int): Vehiculo(marca, modelo, capacidadCombustible) {

    val autonomia = calcularAutonomia() - 40

    override fun mostrarInfo() {
        println("$marca $modelo - Capacidad de combustible: $capacidadCombustible - Autonomia: ${autonomia}")
    }

}