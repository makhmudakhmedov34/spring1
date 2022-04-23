package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "user_account_id")
    private Long id;

    private String email;
    private String password;
    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_details_id")
    private AccountDetail accountDetail;

    @OneToMany(mappedBy = "userAccount", fetch = FetchType.LAZY)
    private List<Ticket> ticketList;

    public UserAccount(Long id, String email, String password, String username) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
    }
}
