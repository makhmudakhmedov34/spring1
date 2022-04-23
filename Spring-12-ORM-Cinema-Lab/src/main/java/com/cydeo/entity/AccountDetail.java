package com.cydeo.entity;

import com.cydeo.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "account_details")
@NoArgsConstructor
@Data
public class AccountDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "account_details_id")
    private Long id;

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private int age;
    private String postalCode;
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "accountDetail")
    private UserAccount userAccount;


    public AccountDetail(Long id, String name, String address, String country, String city, String state, int age, String postalCode, Role role) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.country = country;
        this.city = city;
        this.state = state;
        this.age = age;
        this.postalCode = postalCode;
        this.role = role;
    }
}
