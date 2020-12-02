package com.mt.seatreservationsystem.repository.screening;

public class ScreeningNotFoundException extends Exception {

    public ScreeningNotFoundException() {
        super();
    }

    public ScreeningNotFoundException(Long id) {
        super(String.format("Screening with id %d not found", id));
    }

}
