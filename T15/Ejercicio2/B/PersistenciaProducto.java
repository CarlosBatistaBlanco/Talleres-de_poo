package T15.Ejercicio2.B;

import T15.Ejercicio2.A.Producto;

public class PersistenciaProducto {

    public void guardar(Producto producto) {
        System.out.println("Guardando el producto " + producto.getNombre() + " en la base de datos...");
    }
}
