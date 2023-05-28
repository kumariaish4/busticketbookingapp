package com.booking.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusSeatDTO {

    private Long seatId;

    @NotNull(message = "Seat number is required")
    @Positive(message = "Seat number must be positive")
    private Integer seatNumber;

    private Boolean isAvailable;

    @NotNull(message = "Bus is required")
    private Long busId;

}
