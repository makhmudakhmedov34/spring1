package com.cydeo.entity;


import ch.qos.logback.core.status.Status;
import com.cydeo.enums.State;
import com.cydeo.enums.Type;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "movie_id")
    private Long id;

    private String name;
    private double price;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private State state;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime releaseDate;

    private int duration;
    private String summary;



    @ManyToMany
    @JoinTable(name = "movie_genre_rel",
            joinColumns = @JoinColumn(name="movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genreList;


    public Movie(Long id, String name, double price, Type type, State state, LocalDateTime releaseDate, int duration, String summary) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.state = state;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.summary = summary;
    }
}
