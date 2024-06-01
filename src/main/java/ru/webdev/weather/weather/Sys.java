package ru.webdev.weather.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@jakarta.persistence.Embeddable
public class Sys {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;
}
