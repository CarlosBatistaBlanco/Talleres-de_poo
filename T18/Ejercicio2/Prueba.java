package T18.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(30000);

        cuenta.transferir(2000, "Cuenta1");
        cuenta.retirar(1000);
        cuenta.pagarFactura(6000, "Factura3"); 

        System.out.println("Saldo final: $" + cuenta.getSaldo()); 
    }
}
