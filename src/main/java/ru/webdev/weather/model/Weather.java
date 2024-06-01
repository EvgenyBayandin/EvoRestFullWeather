package ru.webdev.weather.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.webdev.weather.weather.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Weather {

    @Id
    @GeneratedValue
    @Column(insertable=false, updatable=false)
    private int id;

    @Embedded
    private Coordinates coord;

    @ElementCollection
    @CollectionTable(name = "weather_condition", joinColumns = @JoinColumn(name = "weather_id"))
    private List<WeatherCondition> weatherConditions;

    private String base;

    @Embedded
    private Main main;

    private int visibility;

    @Embedded
    private Wind wind;

    @Embedded
    private Clouds clouds;

    private int dt;

    @Embedded
    private Sys sys;

    private int timezone;

    private int weatherId;

    private String name;

    private int cod;

    @NonNull
    private Instant createdAt;

}
