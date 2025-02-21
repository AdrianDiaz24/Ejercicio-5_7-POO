class Automovil(marca: String, modelo: String, capacidadCombustible: Int, tipo: TipoAutomovil): Vehiculo(marca, modelo, capacidadCombustible) {

    val autonomia = calcularAutonomia() + 100

}