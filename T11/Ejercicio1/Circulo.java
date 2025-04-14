package T11.Ejercicio1;


public class Circulo extends Figura {
    private double radio; 

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio; 
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; 
    }
}
