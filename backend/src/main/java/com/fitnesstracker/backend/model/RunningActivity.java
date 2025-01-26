package com.fitnesstracker.backend.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "activity_data")
public class RunningActivity {

    @Id
    private String id;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_id")
    private List<Position> positions;

    @Column(name = "total_distance", nullable = false)
    private double totalDistance;

    @Column(name = "total_time", nullable = false)
    private int totalTime; // in seconds

    // Default constructor
    public RunningActivity() {}

    // Constructor with all fields
    public RunningActivity(String id, LocalDateTime startTime, List<Position> positions, double totalDistance, int totalTime) {
        this.id = id;
        this.startTime = startTime;
        this.positions = positions;
        this.totalDistance = totalDistance;
        this.totalTime = totalTime;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
}
