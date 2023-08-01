package com.example.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.first.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {

    
}
