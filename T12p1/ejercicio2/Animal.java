package T12p1.ejercicio2;

import T12.ejercicio1.Volador;
import T12.ejercicio2.Nadador;

public class Animal implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El animal esta volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El animal esta nadando.");
    }
}
