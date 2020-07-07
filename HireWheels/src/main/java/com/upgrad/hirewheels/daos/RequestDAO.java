package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("requestDAO")
public interface RequestDAO extends JpaRepository<Request,Integer> {
}
