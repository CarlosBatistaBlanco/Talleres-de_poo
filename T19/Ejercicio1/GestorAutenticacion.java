package T19.Ejercicio1;

import T15.Ejercicio3.B.ServicioAutenticacion;

public class GestorAutenticacion { 
    private ServicioAutenticacion servicioAutenticacion; 

    public ServicioAutenticacion getServicioAutenticacion() {
        return servicioAutenticacion;
    }

    public void setServicioAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) { 
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public boolean autenticarUsuario(String usuario, String contraseña) { 
        return servicioAutenticacion.autenticar(usuario, contraseña); 
    }
}
