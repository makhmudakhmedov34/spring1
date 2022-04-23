package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "location_id")
    private Long id;

    private String name;
    private String latitude;
    private String longitude;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;

    @OneToMany(mappedBy = "location")
    private List<Cinema> cinemaList;

    public Location(Long id, String name, String latitude, String longitude, String country, String city, String state, String postalCode, String address) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.address = address;
    }
}
