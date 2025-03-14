package Taller3siguiente.Ejercicio3.Ok;

public class Derivada extends Base {
    @Override
    public void metodo() {
        System.out.println("Metodo de la clase Derivada");
    }

    public static void main(String[] args) {
        Derivada obj = new Derivada();
        obj.metodo();
    }
}