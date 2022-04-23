package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@Data
public class MovieCinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "movie_cinema_id")
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDate dateTime;

    @OneToMany(mappedBy = "movieCinema")
    private List<Ticket> ticketList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;


    public MovieCinema(Long id, LocalDate dateTime) {
        this.id = id;
        this.dateTime = dateTime;
    }
}
