public class EnviarMailAlerta extends Accion {
    @Override
    public void recibirAlerta(AlertaMeteorologica alerta) {
        if(alerta.hayAlertas()){
            String mensaje = "ALERTA METEOROLOGICO: " + alerta.listadoAlertas();
            usuarios.stream().forEach(usuario -> usuario.recibirMail(mensaje));
        }
    }
}