package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Patient; 

public interface repositoryPatient extends JpaRepository<Patient,Integer>{

}
