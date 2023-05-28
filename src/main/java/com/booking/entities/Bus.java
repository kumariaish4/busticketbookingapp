package com.booking.entities;

import javax.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "buses")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;

    private String busName;

    private String busNumber;

    private Integer totalSeats;

    @OneToMany(mappedBy = "bus")
    private List<BusSeat> busSeats;
}
