package ru.webdev.weather.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@jakarta.persistence.Embeddable
public class Wind {
    private float speed;
    private int deg;
    private double gust;
}
