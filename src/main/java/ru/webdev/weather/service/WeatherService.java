package ru.webdev.weather.service;

import java.time.Instant;
import java.util.Optional;
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

    public WeatherService() {
        this.restTemplate = new RestTemplate();
    }

    public Iterable<Weather> findAll() {
        return repository.findAll();
    }

    public Optional<Weather> findByNameIgnoreCase(String name) {
        return repository.findByNameIgnoreCase(name);
    }

    public Weather getCurrentWeather(float lat, float lon) {
        String url = geoUrl + "&lat=" + lat + "&lon=" + lon + "&appid=" + geoKey;

        Weather weather = restTemplate.getForObject(url, Weather.class);

        Instant instant = Instant.now();
        weather.setCreatedAt(instant);

        return repository.save(weather);
    }

}
