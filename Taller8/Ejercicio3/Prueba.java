package Taller8.Ejercicio3;

// Clase de prueba para las clases Empleado y Gerente
public class Prueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan torres", 42600);
        empleado1.mostrarDetalles();

        
        Gerente gerente1 = new Gerente("willian pacheco", 11000, "programacion");
        gerente1.mostrarDetalles();
    }
}
