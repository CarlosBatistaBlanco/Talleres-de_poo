package T15.Ejercicio1.B;

import T15.Ejercicio1.A.Libro;

public class GeneradorReporte { 

    public void generarReporte(Libro libro) { 
        System.out.println("Titulo: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", ID: " + libro.getId());
    }
}
