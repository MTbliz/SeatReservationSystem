package com.mt.seatreservationsystem.repository.screening;

import com.mt.seatreservationsystem.repository.movie.MovieEntity;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "screenings")
@Getter
public class ScreeningEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private final MovieEntity movie;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private final ZonedDateTime displaytime;

    public ScreeningEntity(Long id, MovieEntity movie, ZonedDateTime displaytime) {
        this.id = id;
        this.movie = movie;
        this.displaytime = displaytime;
    }
}
