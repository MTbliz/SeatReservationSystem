package com.mt.seatreservationsystem.repository.cinemahall;

public class CinemaHallNotFoundException extends Exception {

    public CinemaHallNotFoundException() {
        super();
    }

    public CinemaHallNotFoundException(Long id) {
        super(String.format("Cinema hall with id %d not found", id));
    }
}
