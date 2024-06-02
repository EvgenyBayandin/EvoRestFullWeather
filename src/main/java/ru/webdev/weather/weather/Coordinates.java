package ru.webdev.weather.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Coordinates {

    @JsonProperty("lat")
    private float lat;

    @JsonProperty("lon")
    private float lon;

}
