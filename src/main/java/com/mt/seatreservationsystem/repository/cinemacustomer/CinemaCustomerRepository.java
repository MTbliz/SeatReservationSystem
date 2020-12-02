package com.mt.seatreservationsystem.repository.cinemacustomer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaCustomerRepository extends CrudRepository<CinemaCustomerEntity, Long> {

}
