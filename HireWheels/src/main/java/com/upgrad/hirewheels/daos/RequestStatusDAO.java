package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("requestStatusDAO")
public interface RequestStatusDAO extends JpaRepository<RequestStatus,Integer> {
}
