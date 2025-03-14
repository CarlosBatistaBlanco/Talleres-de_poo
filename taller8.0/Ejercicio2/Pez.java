package Taller8siguiente.Ejercicio2;

public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); 
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); 
        System.out.println("Tipo de Agua: " + tipoDeAgua); 
    }
}
