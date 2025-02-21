class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int): Vehiculo(marca, modelo, capacidadCombustible) {

    val autonomia = calcularAutonomia() - 40

}