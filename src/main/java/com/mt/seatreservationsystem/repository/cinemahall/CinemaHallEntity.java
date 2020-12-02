package com.mt.seatreservationsystem.repository.cinemahall;

import com.mt.seatreservationsystem.repository.cinemaseat.CinemaSeatEntity;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "cinema_halls")
@Getter
public class CinemaHallEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @NotBlank(message = "The hall number can't be blank")
    private final int hallNumber;

    @OneToMany(cascade = CascadeType.ALL)
    private final List<CinemaSeatEntity> seats;

    public CinemaHallEntity(Long id, int hallNumber, List<CinemaSeatEntity> seats) {
        this.id = id;
        this.hallNumber = hallNumber;
        this.seats = seats;
    }
}
