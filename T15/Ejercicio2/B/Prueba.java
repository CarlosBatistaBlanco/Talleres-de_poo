package T15.Ejercicio2.B;

public class Prueba { 
    public static void main(String[] args) { 
        Producto Producto = new Producto("Celular", 12000.0, 0.19); 
        GeneradorEtiqueta generador = new GeneradorEtiqueta();
        PersistenciaProducto persistencia = new PersistenciaProducto(); 

        generador.generarEtiqueta(Producto);
        persistencia.guardar(Producto); 
    }
}

