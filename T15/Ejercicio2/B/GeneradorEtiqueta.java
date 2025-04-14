package T15.Ejercicio2.B;

import T15.Ejercicio2.A.Producto;

public class GeneradorEtiqueta {

    public void generarEtiqueta(Producto producto) { 
        System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.calcularPrecioFinal());
    }
}
