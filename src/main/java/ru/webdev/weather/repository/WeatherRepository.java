package ru.webdev.weather.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import ru.webdev.weather.model.Weather;

public interface WeatherRepository extends CrudRepository<Weather, Integer>{
    Optional<Weather> findByNameIgnoreCase(String name);
}
