import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Fifa {
    private static final String API_URL = "https://api.api-futebol.com.br/v1/atletas/";
    private static final String AUTH_TOKEN = "live_2281db914224b245558f5428a27fb8";
    
    public String buscaJogador(String idJogador ) {
        String consulta = API_URL + idJogador;
                           


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(consulta))
                .header("Authorization", "Bearer " + AUTH_TOKEN)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return "";
    }

    @Override
    public String toString() {
        return "Fifa []";
    }
}