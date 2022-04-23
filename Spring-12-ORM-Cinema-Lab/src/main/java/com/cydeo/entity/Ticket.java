package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ticket_id")
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDate dateTime;

    private int seatNumber;
    private int rowNumber;

    @ManyToOne
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;

    @ManyToOne
    @JoinColumn(name = "movie_cinema_id")
    private MovieCinema movieCinema;

    public Ticket(Long id, LocalDate dateTime, int seatNumber, int rowNumber) {
        this.id = id;
        this.dateTime = dateTime;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;

    }
}
