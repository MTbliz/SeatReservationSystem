package com.mt.seatreservationsystem.repository.movie;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "movies")
@Getter
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @NotBlank(message = "The Title of the movie can't be blank")
    private final String title;

    public MovieEntity(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
