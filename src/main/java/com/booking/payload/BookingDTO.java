package com.booking.payload;

import java.time.LocalDate;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDTO {

    private Long bookingId;

    private Long userId;

    private Long busScheduleId;

    @NotNull(message = "Journey date cannot be null")
    private LocalDate journeyDate;

    @NotNull(message = "Number of seats cannot be null")
    @Positive(message = "Number of seats should be positive")
    private Integer numberOfSeats;

    @NotNull(message = "Total fare cannot be null")
    @Positive(message = "Total fare should be positive")
    private Double totalFare;

    private Boolean isCancelled;

    private PaymentDTO payment;
}
