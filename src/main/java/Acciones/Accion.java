import java.util.*;

public abstract class Accion {
    List<Usuario> usuarios = new ArrayList<Usuario>();

    public abstract void recibirAlerta(AlertaMeteorologica alerta);

    public void suscribirse(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void desuscribirse(Usuario usuario) {
        usuarios.remove(usuario);
    }
}
