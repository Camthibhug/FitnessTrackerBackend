package com.fitnesstracker.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double latitude;

    @Column(nullable = false)
    private double longitude;

    @Column(nullable = false)
    private int time;

    @Column(nullable = false)
    private double distance;

    @Column(nullable = false)
    private double accuracy;

    @Column(name = "speed_accuracy", nullable = false)
    private double speedAccuracy;

    @Column(name = "current_speed", nullable = false)
    private double currentSpeed;

    // Default constructor
    public Position() {}

    // Constructor with all fields
    public Position(double latitude, double longitude, int time, double distance, 
                        double accuracy, double speedAccuracy, double currentSpeed) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.time = time;
        this.distance = distance;
        this.accuracy = accuracy;
        this.speedAccuracy = speedAccuracy;
        this.currentSpeed = currentSpeed;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getSpeedAccuracy() {
        return speedAccuracy;
    }

    public void setSpeedAccuracy(double speedAccuracy) {
        this.speedAccuracy = speedAccuracy;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
