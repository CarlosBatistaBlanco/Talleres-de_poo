package T19.Ejercicio1;

import T19.Ejercicio1.AutenticacionLocal;
import T19.Ejercicio1.AutenticacionOAuth;
import T19.Ejercicio1.GestorAutenticacion;

public class Prueba { 
    public static void main(String[] args) { 
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal(); 
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth(); 

        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal); 
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth); 

        System.out.println("Autenticacion Local: " + gestorLocal.autenticarUsuario("usuarioLocal", "contraseñaLocal")); // Prueba de autenticación local
        System.out.println("Autenticacion OAuth: " + gestorOAuth.autenticarUsuario("usuarioOAuth", "contraseñaOAuth")); // Prueba de autenticación OAuth
    }
}

