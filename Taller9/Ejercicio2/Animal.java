package Taller9.Ejercicio2;

class Animal implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El animal esta volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El animal esta nadando.");
    }
}