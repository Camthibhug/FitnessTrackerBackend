package com.fitnesstracker.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitnesstracker.backend.model.RunningActivity;

@Repository
public interface RunningActivityRepository extends JpaRepository<RunningActivity, Long> {
    // You can add custom query methods here if needed
}
