package ru.webdev.weather.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.webdev.weather.model.Weather;
import ru.webdev.weather.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Value("${geo.url}")
    private String geoUrl;

    @Value("${geo.key}")
    private String geoKey;

    @Autowired
    private WeatherService weatherService;


    @GetMapping
    public Iterable<Weather> findAll() {
        return weatherService.findAll();
    }

    @GetMapping("/{city}")
    public Optional<Weather> findByLocationName(@PathVariable("city") String name) {
        return weatherService.findByNameIgnoreCase(name);
    }

    @GetMapping("/{lat}/{lon}")
    public Weather getCurrentWeather(@PathVariable("lat") float lat, @PathVariable("lon") float lon) {
        return weatherService.getCurrentWeather(lat, lon);
    }

}
