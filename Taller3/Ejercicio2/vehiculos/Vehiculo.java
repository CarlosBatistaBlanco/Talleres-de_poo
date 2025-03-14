package Taller3.Ejercicio2.vehiculos;

// Clase Vehículo con acceso de paquete
class Vehiculo {
    String tipo;  // Acceso de paquete

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}
