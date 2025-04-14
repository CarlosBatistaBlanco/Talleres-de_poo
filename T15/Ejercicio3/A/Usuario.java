package T15.Ejercicio3.A;

public class Usuario { 
    private String nombreUsuario; 
    private String contraseña; 

    public Usuario(String nombreUsuario, String contraseña) { 
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() { 
        return nombreUsuario;
    }

    public String getContraseña() { 
        return contraseña;
    }

    public boolean autenticar(String nombreUsuario, String contraseña) { 
        return this.nombreUsuario.equals(nombreUsuario) && this.contraseña.equals(contraseña);
    }

    public boolean validarContraseña() { 
        return contraseña.length() >= 8 && contraseña.matches(".*\\d.*") && contraseña.matches(".*[a-zA-Z].*");
    }
}

