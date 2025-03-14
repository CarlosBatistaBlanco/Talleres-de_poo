package Taller1.EjercicioFinal;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto 
    public CuentaBancaria() {
        this.numeroCuenta = "2584925421";
        this.saldo = 3000.0;                 
        this.tipoCuenta = "CORRIENTE"; 
    }

    // Constructor parametrizado 
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;  
        this.saldo = 54000.0;                 
        this.tipoCuenta = tipoCuenta;   
    }

    // Constructor sobrecargado 
    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta; 
        this.saldo = saldo;                
        this.tipoCuenta = tipoCuenta;     
    }

    // Método para mostrar 
    public void mostrarDetalles() {
        System.out.println("Numero de Cuenta: " + this.numeroCuenta); 
        System.out.println("Saldo: " + this.saldo);                   
        System.out.println("Tipo de Cuenta: " + this.tipoCuenta);    
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
       
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles(); 
        
        CuentaBancaria cuenta2 = new CuentaBancaria("5291421615", "AHORO");
        cuenta2.mostrarDetalles(); 

        CuentaBancaria cuenta3 = new CuentaBancaria("25592895298", "CORRIENTE", 58400.0);
        cuenta3.mostrarDetalles(); 
    }
}