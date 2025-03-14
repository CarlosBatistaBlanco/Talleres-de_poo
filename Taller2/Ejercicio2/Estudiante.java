package Taller2.Ejercicio2;

// Clase Estudiante con atributos nombre y edad
class Estudiante {
    private String nombre;
    private int edad;

    // Constructor por defecto que llama a otro constructor con this()
    public Estudiante() {
        this("Desconocido", 18);
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo para mostrar la informacion del estudiante
    public void mostrarInfo() {
        System.out.println("Estudiante: " + this.nombre + ", Edad: " + this.edad);
    }
}
