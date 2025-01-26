package com.fitnesstracker.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitnesstracker.backend.model.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
    // You can add custom query methods here if needed
}
