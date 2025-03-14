package Taller1.Ejercicio2;


public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    
    public CuentaBancaria() {
        this.numeroCuenta = "3567849146";
        this.saldo = 1000.0;                 
        this.tipoCuenta = "ahorros"; 
    }

    
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;  
        this.saldo = 0.0;                  
        this.tipoCuenta = tipoCuenta;     
    }

    
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;  
        this.saldo = saldo;                
        this.tipoCuenta = tipoCuenta;     
    }

    
    public void mostrarDetalles() {
        System.out.println("Numero de Cuenta: " + this.numeroCuenta); 
        System.out.println("Saldo: " + this.saldo);                   
        System.out.println("Tipo de Cuenta: " + this.tipoCuenta);     
    }

    
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles(); 

        
        CuentaBancaria cuenta2 = new CuentaBancaria("1245768894", "Coriente");
        cuenta2.mostrarDetalles(); 

        
        CuentaBancaria cuenta3 = new CuentaBancaria("4556284956", 5000.0, "Corriente");
        cuenta3.mostrarDetalles(); 
    }
}

