package T11.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("jean ballestero", 60, 50000, 40000);
        gerente.mostrarDetalles(); 

        Empleado vendedor = new Vendedor("eder coneo", 40, 60000, 35000);
        vendedor.mostrarDetalles(); 
    }
}
