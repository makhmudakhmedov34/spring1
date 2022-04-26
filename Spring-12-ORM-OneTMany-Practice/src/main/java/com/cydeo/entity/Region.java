package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Data
@Table(name = "regions")
public class Region {

    @Id
    private Long id;

    private String region;
    private String country;



    public Region(Long id, String region, String country) {
        this.id = id;
        this.region = region;
        this.country = country;
    }


}
