package com.mt.seatreservationsystem.repository.cinemacustomer;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "cinema_customers")
@Getter
public class CinemaCustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @Pattern(regexp = "^[A-ZŻŹĆĄŚĘŁÓŃ]([a-zżźćńółęąś]){1,}([a-zżźćńółęąś])$",
            message = "FirstName length must be at least 3 characters and starts from Capital letter.")
    private final String firstName;

    @Pattern(regexp = "^[A-ZŻŹĆĄŚĘŁÓŃ]([a-zżźćńółęąś]){1,}([a-zżźćńółęąś])$|^[A-ZŻŹĆĄŚĘŁÓŃ]([a-zżźćńółęąś]){0,}[-]" +
            "[A-ZŻŹĆĄŚĘŁÓŃ]([a-zżźćńółęąś])*",
            message = "LastName length must be at least 3 characters, contains only letters or letters with single dash" +
                    " (two prats should start with capital letter)")
    private final String lastName;

    public CinemaCustomerEntity(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
