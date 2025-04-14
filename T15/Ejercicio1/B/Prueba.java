package T15.Ejercicio1.B;

public class Prueba { 
    public static void main(String[] args) { 
        Libro libro = new Libro("son como niños ", "adan sander", "12345678"); 
        GeneradorReporte generador = new GeneradorReporte(); 
        PersistenciaLibro persistencia = new PersistenciaLibro(); 

        generador.generarReporte(libro); 
        persistencia.guardar(libro); 
    }
}

