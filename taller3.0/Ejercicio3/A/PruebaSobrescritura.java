package Taller3siguiente.Ejercicio3.A;
class Base {
    public void metodoBase() {
        System.out.println("Metodo de la clase base");
    }
}

class Derivada extends Base {
   
    public void metodoBase(int parametro) {
        System.out.println("Metodo de la clase derivada con parametro: " + parametro);
    }
}

public class PruebaSobrescritura {
    public static void main(String[] args) {
        Derivada derivada = new Derivada();
        derivada.metodoBase(); 
        derivada.metodoBase(10); 
    }
}
