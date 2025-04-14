package T18.Ejercicio3;

public class Camion implements Conduccion, CargaMercancias {
    @Override
    public void conducir() { 
        System.out.println("El camion esta conduciendo."); 
    }

    @Override
    public void cargarMercancia() { 
        System.out.println("El camion esta cargando mercancia."); 
    }
}

