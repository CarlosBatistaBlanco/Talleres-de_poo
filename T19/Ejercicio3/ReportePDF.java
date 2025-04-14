package T19.Ejercicio3;

import T19.Ejercicio3.GeneradorReporte;

public class ReportePDF implements GeneradorReporte { 
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando reporte en PDF con el contenido: " + contenido);
    }
}
