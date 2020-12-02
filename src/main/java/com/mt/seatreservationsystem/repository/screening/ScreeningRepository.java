package com.mt.seatreservationsystem.repository.screening;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreeningRepository extends CrudRepository<ScreeningEntity, Long> {
}
