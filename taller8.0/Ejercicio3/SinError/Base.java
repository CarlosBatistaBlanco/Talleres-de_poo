package Taller8siguiente.Ejercicio3.SinError;

class Base {
    private int atributoPrivado = 8;

    public int getAtributoPrivado() {
        return atributoPrivado;
    }
}

class Derivada extends Base {
    public void mostrarAtributoPrivado() {
        System.out.println("Atributo Privado: " + super.getAtributoPrivado());
    }
}


