package Taller2.Ejercicio3;

class Persona {
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Metodo de instancia que usa this correctamente
    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre);
    }
}

// Clase de prueba
class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        p.mostrarNombre(); // Asi se debe usarr
    }
}
