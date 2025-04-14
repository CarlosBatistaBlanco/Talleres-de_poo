package T16.Ejercicio2;

import T16.Ejercicio2.Documento;
import T16.Ejercicio2.Exportador;
import T16.Ejercicio2.ExportadorExcel;
import T16.Ejercicio2.ExportadorPDF;
import T16.Ejercicio2.ExportadorWord;

public class Prueba { 
    public static void main(String[] args) { 
        Documento documento = new Documento("Este es el contenido del documento."); 

        Exportador exportadorPDF = new ExportadorPDF(); 
        Exportador exportadorWord = new ExportadorWord(); 
        Exportador exportadorExcel = new ExportadorExcel();

        exportadorPDF.exportar(documento); 
        exportadorWord.exportar(documento); 
        exportadorExcel.exportar(documento); 
    }
}
