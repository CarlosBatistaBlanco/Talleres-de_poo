package T17.Ejercicio1;

public class Prueba { 
    public static void main(String[] args) { 
        Figura circulo = new Circulo(100); 
        Figura rectangulo = new Rectangulo(80, 60);

        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
    }
}
