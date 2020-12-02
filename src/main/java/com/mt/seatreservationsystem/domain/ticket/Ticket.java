package com.mt.seatreservationsystem.domain.ticket;

import java.math.BigDecimal;

public enum Ticket {

    TICKET_ADULT(new BigDecimal(25)),
    TICKET_STUDENT(new BigDecimal(18)),
    TICKET_CHILD(new BigDecimal(12.50));

    private final BigDecimal price;

    Ticket(BigDecimal price) {
        this.price = price;
    }
}
