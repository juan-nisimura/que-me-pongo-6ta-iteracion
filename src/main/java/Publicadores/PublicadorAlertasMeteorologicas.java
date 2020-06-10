import java.util.*;

public class PublicadorAlertasMeteorologicas {
    List<Accion> acciones;
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    AlertaMeteorologica ultimaAlerta, ultimaAlertaPublicada;

    public PublicadorAlertasMeteorologicas(List<Accion> acciones) {
        this.acciones = acciones;
    }
    
    public void publicarAlerta() {
        ultimaAlertaPublicada = ultimaAlerta;
        acciones.stream().forEach(accion -> accion.recibirAlerta(ultimaAlerta));
    }

    public void consultarAlerta() {
        Map<String, ArrayList<String>> alertas = apiClima.getAlertas("Buenos Aires"); 
        ultimaAlerta = new AlertaMeteorologica(alertas.get("CurrentAlerts"));
    }

    public AlertaMeteorologica getUltimaAlertaPublicada() {
        return ultimaAlertaPublicada;
    }
}