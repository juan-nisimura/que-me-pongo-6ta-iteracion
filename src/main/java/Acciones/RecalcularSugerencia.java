public class RecalcularSugerencia extends Accion {

    @Override
    public void recibirAlerta(AlertaMeteorologica alerta) {
        usuarios.stream().forEach(usuario -> usuario.calcularSugerencia());
    }
}