package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "payments")
public class Payment extends BaseEntity{

    private BigDecimal amount;

    @Column(columnDefinition = "DATE")
    private LocalDate createDate;
    @Enumerated(EnumType.STRING)
    private Status paymentStatus;

    @OneToOne(cascade = CascadeType.ALL)
    private PaymentDetail paymentDetail;

    @ManyToOne
    private Merchant merchant;

    @ManyToOne
    private Customer customer;


    public Payment(LocalDate createDate,BigDecimal amount, Status paymentStatus) {
        this.amount = amount;
        this.createDate = createDate;
        this.paymentStatus = paymentStatus;
    }
}
