package Taller3.Ejercicio2.paqueteprueba;

import Taller3.Ejercicio2.vehiculos.*;

public class PruebaVehiculos {
    public static void main(String[] args) {
        
        Vehiculo v = new Vehiculo("Automóvil"); // Error de compilacion: Vehiculo tiene acceso de paquete
        v.mostrarTipo(); // Error de compilación

        Moto m = new Moto("Motocicleta", 0); // Error de compilacion: Moto tiene acceso de paquete
        m.mostrarTipo(); // Error de compilacion
    
    }
}
