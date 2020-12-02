package com.mt.seatreservationsystem.repository.movie;

public class MovieNotFoundException extends Exception {

    public MovieNotFoundException() {
        super();
    }

    public MovieNotFoundException(Long id) {
        super(String.format("Movie with id %d not found", id));
    }
}
