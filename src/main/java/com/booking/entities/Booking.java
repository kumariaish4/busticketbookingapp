package com.booking.entities;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private Long userId;

    private Long busScheduleId;

    private LocalDate journeyDate;

    private Integer numberOfSeats;

    private Double totalFare;

    private Boolean isCancelled;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id", referencedColumnName = "paymentId")
    private Payment payment;

}
