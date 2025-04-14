package T16.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new Descuento(50); 
        DescuentoFijo descuentoFijo = new DescuentoFijo(100); 

        double precioOriginal = 500; 

        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal); 
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal); 

        System.out.println("Precio original: $" + precioOriginal); 
        System.out.println("Precio con descuento del 50%: $" + precioConDescuentoPorcentaje);  
        System.out.println("Precio con descuento fijo de $100: $" + precioConDescuentoFijo); 
    }
}
