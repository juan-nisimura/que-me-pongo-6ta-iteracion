public class Usuario {

    Atuendo ultimaSugerencia;
    Guardarropa guardarropa;
    String correo;

    public void calcularSugerencia() {
        // Voy a suponer que esto ya se resolvió en otra iteración
        ultimaSugerencia = guardarropa.obtenerSugerencia(); 
    }

    public void recibirMail(String mensaje) {
        MailSender>>send(correo,mensaje);
    }

	public void recibirNotificacion(String mensaje) {
		NotificationService>>notify(mensaje);
	}
}