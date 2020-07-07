package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("locationDAO")
public interface LocationDAO extends JpaRepository<Location,Integer> {
}
