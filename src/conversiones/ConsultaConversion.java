package conversiones;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {

    public Conversiones laConversion() {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/191845d3873e1621783287d4/pair/USD/ARS");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        {
            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                Conversiones miConversion = gson.fromJson(json, Conversiones.class);
                return miConversion;
            } catch (Exception e) {
                throw new RuntimeException("No encontre esa conversion.");
            }
        }

    }
}
