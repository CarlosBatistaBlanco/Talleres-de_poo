package T11.Ejercicio2;


public abstract class Empleado {
    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + calcularSalario());
    }
}
