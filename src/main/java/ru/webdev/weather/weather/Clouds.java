package ru.webdev.weather.weather;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@jakarta.persistence.Embeddable
public class Clouds {
    @Column(name = "`all`")
    private int all;
}
