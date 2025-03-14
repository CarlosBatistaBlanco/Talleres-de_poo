package Taller6.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
       
        Coche coche1 = new Coche("chebrolet", "oni turbo");
        Coche coche2 = new Coche("kia", "picanto");
        Coche coche3 = new Coche("renauw", "sandero");
         
        coche1.mostrarDetalles();
        coche2.mostrarDetalles();
        coche3.mostrarDetalles();

        Coche.mostrarContadorCoches();
    }
}

