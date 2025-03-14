package Taller7.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("camilo", 17, 5000, 3000);
        gerente.mostrarDetalles(); 

        Empleado vendedor = new Vendedor("jose", 55, 6000, 100);
        vendedor.mostrarDetalles(); 
    }
}
