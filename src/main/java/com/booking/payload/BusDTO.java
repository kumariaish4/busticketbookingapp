package com.booking.payload;


import lombok.*;

import java.util.List;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusDTO {

    private Long busId;

    @NotBlank(message = "Bus name cannot be blank")
    private String busName;

    @NotBlank(message = "Bus number cannot be blank")
    private String busNumber;

    @NotNull(message = "Total seats cannot be null")
    @Positive(message = "Total seats should be positive")
    private Integer totalSeats;

    @NotNull(message = "Bus seats cannot be null")
    @Size(min = 1, message = "At least one seat is required")
    private List<BusSeatDTO> busSeats;
}

