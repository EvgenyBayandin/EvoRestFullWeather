package ru.webdev.weather.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Wind {

    @JsonProperty("speed")
    private float speed;

    @JsonProperty("deg")
    private int deg;

    @JsonProperty("gust")
    private Double gust;
}
