package com.vitor.weather_api.controller;

import com.vitor.weather_api.dto.WeatherResponse;
import com.vitor.weather_api.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService service;

    @GetMapping("/{city}")
    public WeatherResponse getWeather(@PathVariable String city) throws Exception {
        return service.getWeather(city);
    }

    @GetMapping("/teste")
    public String testarApi() {
        return "API de clima funcionando!";
    }
}
