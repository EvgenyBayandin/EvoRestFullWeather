package ru.webdev.weather.weather;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class WeatherCondition {
    private int id;
    private String main;
    private String description;
    private String icon;
}
