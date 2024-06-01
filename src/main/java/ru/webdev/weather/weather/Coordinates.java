package ru.webdev.weather.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@jakarta.persistence.Embeddable
public class Coordinates {

    private float latitude;
    private float longitude;

}
