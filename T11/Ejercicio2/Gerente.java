package T11.Ejercicio2;
public class Gerente extends Empleado {
    private double salarioBase;
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    private double bono;

    public Gerente(String nombre, int edad, double salarioBase, double bono) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
