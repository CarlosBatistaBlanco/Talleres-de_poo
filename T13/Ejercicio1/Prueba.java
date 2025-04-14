package T13.Ejercicio1;

import T11.Ejercicio1.Rectangulo;

public class Prueba {
    public static void main(String[] args) { 
        Figura rectangulo = new Rectangulo(20, 10); 
        Figura triangulo = new Triangulo(5, 7);  

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea()); 
    }
}
