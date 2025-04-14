package T15.Ejercicio3.B;

import T15.Ejercicio3.A.Usuario;

public class ServicioValidacion { 

    public boolean validarContraseña(Usuario usuario) { 
        String contraseña = usuario.getContraseña();
        return contraseña.length() >= 6 && contraseña.matches(".*\\d.*") && contraseña.matches(".*[a-zA-Z].*");
    }
}

