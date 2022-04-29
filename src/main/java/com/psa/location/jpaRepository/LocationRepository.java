package com.psa.location.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.location.entites.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
