package com.mt.seatreservationsystem.repository.reservation;

import com.mt.seatreservationsystem.repository.cinemacustomer.CinemaCustomerEntity;
import com.mt.seatreservationsystem.repository.cinemaseat.CinemaSeatEntity;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
@Table(name = "reservations")
@Getter
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private final ZonedDateTime reservationDate;

    @ManyToOne()
    @JoinColumn(name = "customer_id", nullable = false)
    private final CinemaCustomerEntity cinemaCustomer;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "customers_seats",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "seat_id"))
    private final Set<CinemaSeatEntity> cinemaSeats;

    public ReservationEntity(Long id, ZonedDateTime reservationDate, CinemaCustomerEntity cinemaCustomer, Set<CinemaSeatEntity> cinemaSeats) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.cinemaCustomer = cinemaCustomer;
        this.cinemaSeats = cinemaSeats;
    }
}
