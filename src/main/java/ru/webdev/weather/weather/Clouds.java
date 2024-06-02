package ru.webdev.weather.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Clouds {

    @Column(name = "`all`")
    @JsonProperty("all")
    private int all;
}
