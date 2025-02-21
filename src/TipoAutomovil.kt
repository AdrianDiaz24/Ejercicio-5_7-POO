enum class TipoAutomovil(val descripcion: String) {
    SEDAN("Sedán"),
    SUV("SUV"),
    DEPORTIVO("Deportivo"),
    TODOTERRENO("Todoterreno"),
    PICK_UP("Pick up");

    override fun toString(): String {
        return descripcion
    }
}