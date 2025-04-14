package T16.Ejercicio3;

public class Prueba { 
    public static void main(String[] args) {
        CanalEnvio correo = new CanalCorreo(); 
        CanalEnvio sms = new CanalSMS();
        CanalEnvio notificacionPush = new CanalNotificacionPush(); 

        correo.enviarMensaje("cbb@unicolombo.com", "Hola,it´s email");
        sms.enviarMensaje("95871263", "hi, it's  SMS");
        notificacionPush.enviarMensaje("usuario1", "hi, it's notificacion push");
    }
}
