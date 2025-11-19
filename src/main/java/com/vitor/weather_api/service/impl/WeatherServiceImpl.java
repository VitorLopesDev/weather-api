package com.vitor.weather_api.service;

import com.vitor.weather_api.client.WeatherClient;
import com.vitor.weather_api.dto.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final WeatherClient client;

    @Override
    public WeatherResponse getWeather(String city) throws Exception {
        return client.getWeather(city);
    }
}
