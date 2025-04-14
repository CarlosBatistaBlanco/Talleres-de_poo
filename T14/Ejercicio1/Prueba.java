package T14.Ejercicio1;

public class Prueba { 
    public static void main(String[] args) { 
        Figura figura1 = new Circulo(6); 
        Figura figura2 = new Rectangulo(12, 9);

        figura1.calcularArea();
        figura2.calcularArea(); 
    }
}