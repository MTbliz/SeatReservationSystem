package com.mt.seatreservationsystem.repository.cinemacustomer;

public class CinemaCustomerNotFoundException extends Exception {

    public CinemaCustomerNotFoundException() {
        super();
    }

    public CinemaCustomerNotFoundException(Long id) {
        super(String.format("Customer with id %d not found", id));
    }
}
