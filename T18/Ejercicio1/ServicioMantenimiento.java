package T18.Ejercicio1;

import T18.Ejercicio1.Limpieza;
import T18.Ejercicio1.Reparacion;

public class ServicioMantenimiento implements Reparacion, Limpieza { 

    @Override
    public void reparar() { 
        System.out.println("Realizando reparacion."); 
    }

    @Override
    public void limpiar() { 
        System.out.println("Realizando limpieza."); 
    }
}
