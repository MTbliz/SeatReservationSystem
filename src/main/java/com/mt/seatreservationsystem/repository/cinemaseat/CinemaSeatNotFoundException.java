package com.mt.seatreservationsystem.repository.cinemaseat;

public class CinemaSeatNotFoundException extends Exception {

    public CinemaSeatNotFoundException() {
        super();
    }

    public CinemaSeatNotFoundException(Long id) {
        super(String.format("Cinema seat with id %d not found", id));
    }
}
