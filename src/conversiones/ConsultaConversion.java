package conversiones;

import calculos.LasMonedas;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion  {

    public Conversiones laConversion(LasMonedas conver) {
        String direccion = "https://v6.exchangerate-api.com/v6/191845d3873e1621783287d4/pair/"
                + conver.convertir();

        Gson gson = new GsonBuilder().create();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

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

