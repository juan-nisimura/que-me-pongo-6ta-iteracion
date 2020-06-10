import java.util.*;

public class PublicadorSugerenciasDiarias {
    List<Usuario> usuarios;

    public void disparar() {
        usuarios.stream().forEach(usuario -> usuario.calcularSugerencia());
    }

    public void sucribir(Usuario usuario){
        usuarios.add(usuario);
    }

    public void desuscribir(Usuario usuario) {
        usuarios.remove(usuario);
    }
}