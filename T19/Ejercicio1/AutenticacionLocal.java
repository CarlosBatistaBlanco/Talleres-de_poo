package T19.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String contraseña) {
        
        if ("usuario".equals(usuario) && "contraseña".equals(contraseña)) {
            return true; 
        }
        return false; 
    }
}

