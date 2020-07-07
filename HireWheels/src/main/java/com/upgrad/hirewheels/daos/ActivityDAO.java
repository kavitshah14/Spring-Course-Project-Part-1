package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("activityDAO")
public interface ActivityDAO extends JpaRepository<Activity,Integer> {
}
