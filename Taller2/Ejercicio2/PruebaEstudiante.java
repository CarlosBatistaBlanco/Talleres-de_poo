package Taller2.Ejercicio2;

// Clase de prueba
class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante(); // Llama al constructor por defecto
        e1.mostrarInfo();

        Estudiante e2 = new Estudiante("Camilo", 20);
        e2.mostrarInfo();
    }
}
