package T16.Ejercicio3;

public class CanalNotificacionPush implements CanalEnvio { 
    @Override
    public void enviarMensaje(String destinatario, String mensaje) { 
        System.out.println("Enviando notificacion push a " + destinatario + " con el mensaje: " + mensaje);
    }
}
