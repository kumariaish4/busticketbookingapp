package com.booking.payload;

import java.util.List;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RouteDTO {

    private Long routeId;

    @NotBlank(message = "Source cannot be blank")
    private String source;

    @NotBlank(message = "Destination cannot be blank")
    private String destination;

    @NotNull(message = "Distance cannot be null")
    @Positive(message = "Distance should be positive")
    private Double distance;

    private List<BusScheduleDTO> busSchedules;
}
