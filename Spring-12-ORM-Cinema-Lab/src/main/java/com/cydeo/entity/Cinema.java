package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@Data
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cinema_id")
    private Long id;

    private String name;
    private String sponsoredName;

    @OneToMany(mappedBy = "cinema")
    private List<MovieCinema> movieCinemaList;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public Cinema( String name,String sponsoredName, Long id) {
        this.id = id;
        this.name = name;
        this.sponsoredName = sponsoredName;
    }
}
