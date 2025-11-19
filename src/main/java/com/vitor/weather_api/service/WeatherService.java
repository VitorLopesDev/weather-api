package com.vitor.weather_api.service;

import com.vitor.weather_api.dto.WeatherResponse;

public interface WeatherService {
    WeatherResponse getWeather(String city) throws Exception;
}
