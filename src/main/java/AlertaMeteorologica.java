import java.util.List;

public class AlertaMeteorologica {
    private final List<String> listaAlertas;

    public AlertaMeteorologica(final List<String> listaAlertas) {
        this.listaAlertas = listaAlertas;
    }

    public boolean hayTormenta() {
        return listaAlertas.contains("STORM");
    }

    public boolean hayGranizo() {
        return listaAlertas.contains("HAIL");
    }

	public boolean hayAlertas() {
		return !listaAlertas.isEmpty();
	}

    public String listadoAlertas(){
        String listado = "";
        listaAlertas.stream().forEach(alerta -> listado = alerta + " ");
        return listado;
    }
}
