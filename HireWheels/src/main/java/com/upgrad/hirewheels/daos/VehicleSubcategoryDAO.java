package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.VehicleSubcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicleSubcategoryDAO")
public interface VehicleSubcategoryDAO extends JpaRepository<VehicleSubcategory,Integer> {
}
