package T15.Ejercicio3.B;

import T15.Ejercicio3.A.Usuario;

public class ServicioAutenticacion { 

    public boolean autenticar(Usuario usuario, String nombreUsuario, String contraseña) {  
        return usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContraseña().equals(contraseña);
    }
}

