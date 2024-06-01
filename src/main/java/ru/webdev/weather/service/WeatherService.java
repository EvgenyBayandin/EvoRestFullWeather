package ru.webdev.weather.service;

import java.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.webdev.weather.model.Weather;
import ru.webdev.weather.repository.WeatherRepository;

@Service
public class WeatherService {
    @Value("${geo.url}")
    private String geoUrl;

    @Value("${geo.key}")
    private String geoKey;

    @Autowired
    private WeatherRepository repository;

    private RestTemplate restTemplate;

    private Weather getCurrentWeather(String name, float longitude, float latitude, Instant instant){
        String url = geoUrl + "&lon=" + longitude + "&lat=" + latitude + "&appid=" + geoKey;
        Weather weather = restTemplate.getForObject(url, Weather.class);

        weather.setCreatedAt(instant.now());

        return repository.save(weather);
    }

}
