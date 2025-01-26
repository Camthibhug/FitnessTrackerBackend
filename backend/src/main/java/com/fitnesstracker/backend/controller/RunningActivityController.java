package com.fitnesstracker.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitnesstracker.backend.model.RunningActivity;
import com.fitnesstracker.backend.repository.RunningActivityRepository;

@RestController
@RequestMapping("/api/running-activities")
public class RunningActivityController {

    @Autowired
    private RunningActivityRepository runningActivityRepository;

    @PostMapping
    public ResponseEntity<RunningActivity> createRunningActivity(@RequestBody RunningActivity runningActivity) {
        RunningActivity savedActivity = runningActivityRepository.save(runningActivity);
        return new ResponseEntity<>(savedActivity, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<RunningActivity>> getAllRunningActivities() {
        List<RunningActivity> activities = runningActivityRepository.findAll();
        return new ResponseEntity<>(activities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RunningActivity> getRunningActivityById(@PathVariable Long id) {
        return runningActivityRepository.findById(id)
                .map(activity -> new ResponseEntity<>(activity, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
