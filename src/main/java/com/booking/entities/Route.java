package com.booking.entities;

import java.util.List;
import javax.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long routeId;

    private String source;

    private String destination;

    private Double distance;

    @OneToMany(mappedBy = "route")
    private List<BusSchedule> busSchedules;
}
