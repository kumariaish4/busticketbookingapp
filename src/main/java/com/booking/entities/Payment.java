package com.booking.entities;

import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    private String paymentType;

    private String cardNumber;

    private String cardHolderName;

    private String cvv;

    private Integer expiryMonth;

    private Integer expiryYear;

    private Double paymentAmount;

    @OneToOne(mappedBy = "payment")
    private Booking booking;

}
