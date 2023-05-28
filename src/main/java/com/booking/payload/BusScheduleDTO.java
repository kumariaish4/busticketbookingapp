package com.booking.payload;


import lombok.*;
import javax.validation.constraints.*;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusScheduleDTO {

    private Long scheduleId;

    @NotNull(message = "Departure time is required")
    private LocalTime departureTime;

    @NotNull(message = "Arrival time is required")
    private LocalTime arrivalTime;

    @NotNull(message = "Bus is required")
    private Long busId;

    @NotNull(message = "Route is required")
    private Long routeId;

}
