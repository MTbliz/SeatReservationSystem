package com.mt.seatreservationsystem.repository.cinemaseat;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaSeatRepository extends CrudRepository<CinemaSeatEntity, Long> {

}
