import java.util.*;

public final class AccuWeatherAPI {
    public final Map<String, ArrayList<String>> getAlertas(String ciudad) {
        Map<String, ArrayList<String>> mapa = new HashMap<String, ArrayList<String>>();
        mapa.put("CurrentAlerts", new ArrayList<String>(Arrays.asList("STORM", "HAIL")));
        return mapa;
    }
}