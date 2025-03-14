package Taller2.Ejercicio1;

// Clase Producto con atributos nombre y precio
class Producto {
    private String nombre;
    private double precio;

    // Constructor que usa this para diferenciar atributos y parametros
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Metodo para mostrar la informacion del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + this.nombre + ", Precio: $" + this.precio);
    }
}
