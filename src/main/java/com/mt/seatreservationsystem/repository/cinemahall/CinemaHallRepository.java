package com.mt.seatreservationsystem.repository.cinemahall;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaHallRepository extends CrudRepository<CinemaHallEntity, Long> {

}
