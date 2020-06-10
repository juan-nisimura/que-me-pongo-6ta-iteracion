public class NotificarGranizo extends Accion {
    @Override
    public void recibirAlerta(AlertaMeteorologica alerta) {
        if(alerta.hayGranizo())
            usuarios.stream().forEach(usuario -> usuario
            .recibirNotificacion("ALERTA DE GRANIZO: Te recomiendo encarecidamente que evites salir en auto D:"));
    }
}