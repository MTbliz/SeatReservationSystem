package com.mt.seatreservationsystem.repository.reservation;

public class ReservationNotFoundException extends Exception {

    public ReservationNotFoundException() {
        super();
    }

    public ReservationNotFoundException(Long id) {
        super(String.format("Reservation with id %d not found", id));
    }
}
