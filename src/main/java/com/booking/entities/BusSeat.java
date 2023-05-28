package com.booking.entities;

import javax.persistence.*;
import lombok.*;

import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bus_seats")
public class BusSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;

    private Integer seatNumber;

    private Boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

}
