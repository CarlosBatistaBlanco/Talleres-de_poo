package T16.Ejercicio2;

import T16.Ejercicio2.Documento;
import T16.Ejercicio2.Exportador;

public class ExportadorPDF implements Exportador { 
    @Override
    public void exportar(Documento documento) { 
        System.out.println("Exportando el documento a PDF: " + documento.getContenido());
    }
}
