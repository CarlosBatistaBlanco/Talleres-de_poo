package T14.Ejercicio4;

import T14.Ejercicio4.Bicicleta;
import T14.Ejercicio4.Coche;

public class Prueba { 
    public static void main(String[] args) { 
        Vehiculo miCoche = new Coche(); 
        Vehiculo miBicicleta = new Bicicleta(); 

        miCoche.mover();
        miBicicleta.mover(); 
    }
}
