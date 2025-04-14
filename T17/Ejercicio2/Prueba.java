package T17.Ejercicio2;

public class Prueba { 
    public static void main(String[] args) { 
        CuentaBancaria cuentaAhorros = new CuentaAhorros(5000, 0.04); 
        cuentaAhorros.depositar(4000); 
        cuentaAhorros.retirar(100); 

        ((CuentaAhorros) cuentaAhorros).aplicarInteres(); 

        System.out.println("Saldo final: " + cuentaAhorros.getSaldo()); 
    }
}
