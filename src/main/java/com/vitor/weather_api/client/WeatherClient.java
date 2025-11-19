package com.vitor.weather_api.client;

import java.net.HttpURLConnection;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vitor.weather_api.dto.WeatherResponse;
import org.springframework.stereotype.Component;
import io.github.cdimascio.dotenv.Dotenv;

@Component
public class WeatherClient {

    private final String apiKey;

    public WeatherClient() {
        Dotenv dotenv = Dotenv.load();
        this.apiKey = dotenv.get("WEATHER_API_KEY");
    }

    public WeatherResponse getWeather(String city) throws Exception {
        String urlString = "https://api.weatherapi.com/v1/current.json"
                + "?key=" + apiKey
                + "&q=" + city
                + "&lang=pt";

        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(connection.getInputStream(), WeatherResponse.class);
    }
}
