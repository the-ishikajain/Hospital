package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Invoice; 

public interface repositoryInvoice extends JpaRepository<Invoice,Integer>{

}
