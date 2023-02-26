package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Employee; 

public interface repositoryEmployee extends JpaRepository<Employee,Integer>{

}
