package Taller6.Ejercicio3;

public class BienEstatic {

    private int contador;

    public BienEstatic(int contador) {
        this.contador = contador;
    }

    public static void incrementarContador(BienEstatic instancia) {
        
        instancia.contador++; 
    }

    public int getContador() {
        return contador;
    }
    
    public static void main(String[] args) {
        BienEstatic ejemplo = new BienEstatic(2);
        System.out.println("Contador inicial: " + ejemplo.getContador());
        BienEstatic.incrementarContador(ejemplo);

        System.out.println("Contador luego de incrementar: " + ejemplo.getContador());
    }
}