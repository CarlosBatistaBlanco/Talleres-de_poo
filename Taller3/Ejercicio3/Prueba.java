package Taller3.Ejercicio3;

// Clase de prueba dentro del mismo paquete
class Prueba {
    public static void main(String[] args) {
        Persona p = new Persona("Camilo", 20);

        // Acceso permitido al atributo edad (de paquete)
        System.out.println("Edad: " + p.edad);

        // Intento de acceder directamente al atributo nombre (ERROR)
        // System.out.println(p.nombre); // Error de compilación: nombre es privado

        // Acceso permitido a nombre usando los métodos getter y setter
        System.out.println("Nombre: " + p.getNombre());
    }
}
