package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "customers")
@NoArgsConstructor
@Data
public class Customer extends BaseEntity{

    private String address;
    private String email;
    private String name;
    private String surName;
    private String usrName;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Payment> paymentsList;


    public Customer(String address, String email, String name, String surName, String usrName) {
        this.address = address;
        this.email = email;
        this.name = name;
        this.surName = surName;
        this.usrName = usrName;
    }
}
