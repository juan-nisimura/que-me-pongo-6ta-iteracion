public class NotificarTormenta extends Accion {
    @Override
    public void recibirAlerta(AlertaMeteorologica alerta) {
        if(alerta.hayTormenta())
            usuarios.stream().forEach(usuario -> usuario
                .recibirNotificacion("ALERTA DE TORMENTA: Te recomiendo encarecidamente que te lleves un paraguas :)"));

    }
}