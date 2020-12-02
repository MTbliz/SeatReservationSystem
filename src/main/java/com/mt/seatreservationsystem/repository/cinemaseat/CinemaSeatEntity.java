package com.mt.seatreservationsystem.repository.cinemaseat;

import com.mt.seatreservationsystem.repository.cinemahall.CinemaHallEntity;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "cinema_seats")
@Getter
public class CinemaSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @NotBlank(message = "The Seat number can't be blank")
    private final int seatNumber;

    @ManyToOne()
    @JoinColumn(name = "cinema_hall_id", nullable = false)
    private final CinemaHallEntity cinemaHall;

    public CinemaSeatEntity(Long id, int seatNumber, CinemaHallEntity cinemaHall) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.cinemaHall = cinemaHall;
    }
}
