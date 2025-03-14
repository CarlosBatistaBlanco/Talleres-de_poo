package Taller1.Ejercicio3;


public class Estudiante {
    
    private String nombre;
    private int edad;
    private String curso;

    
    public Estudiante() {
        this.nombre = "carlos batista "; 
        this.edad = 27;               
        this.curso = "Ingenieria ";      
    }

    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;   
        this.edad = edad;        
        this.curso = "bilinguismo";  
    }

    
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);   
        this.curso = curso;     
    }

    
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);  
        System.out.println("Edad: " + this.edad);      
        System.out.println("Curso: " + this.curso);    
    }

    
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles();

        
        Estudiante estudiante2 = new Estudiante("pablo viry", 26);
        estudiante2.mostrarDetalles(); 

        
        Estudiante estudiante3 = new Estudiante("juan reyes", 23, "Medicina General");
        estudiante3.mostrarDetalles(); 
    }
}
