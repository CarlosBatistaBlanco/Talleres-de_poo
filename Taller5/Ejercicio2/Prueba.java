


public class Prueba {
    public static void main(String[] args) {
        Moto miMoto = new Moto("full inyeccion", "zuzuky", 150);
        miMoto.mostrarInformacion();

        // Intentando acceder a datos protegidos desde una clase no relacionada
        // Esto causara errores de compilacion
        System.out.println("Tipo (acceso directo): " + miMoto.tipo);
        System.out.println("Marca (acceso directo): " + miMoto.marca);
    }
}