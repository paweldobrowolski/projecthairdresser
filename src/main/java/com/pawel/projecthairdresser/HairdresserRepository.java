package com.pawel.projecthairdresser;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HairdresserRepository extends CrudRepository<Hairdresser,Long> {
}
