package com.example.demo.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.repository.repositoryEmployee;

import com.example.demo.Entity.Patient;
import com.example.demo.repository.repositoryPatient;

import com.example.demo.Entity.Invoice;
import com.example.demo.repository.repositoryInvoice;

@RestController
public class Controller {
	@Autowired
	repositoryEmployee empRepository;
	@Autowired
	repositoryPatient empP;
	
	@Autowired
	repositoryInvoice empI;

	@GetMapping (path="/getAllEmployees")
	public List<Employee> getAllEmployees()
	{
		List<Employee> empLst=empRepository.findAll();           //http://localhost:8080/getAllEmployees
		return empLst;
	}
	
	@GetMapping (path="/getAllPatients")
	public List<Patient> getAllPatients()
	{
		List<Patient> empLst=empP.findAll();           //http://localhost:8080/getAllEmployees
		return empLst;
	}
	
	@GetMapping (path="/getAllInvoice")
	public List<Invoice> getAllInvoice()
	{
		List<Invoice> empLst=empI.findAll();           //http://localhost:8080/getAllEmployees
		return empLst;
	}

	@PostMapping (path="/insertEmployee")
	public String insertEmployee(@RequestBody Employee empobj)
	{
	System.out.println("Received Data : " +empobj);
	empRepository.save(empobj);
	return "Record inserted successfulyy";
	}
	
	@PostMapping (path="/insertPatient")
	public String insertPatient(@RequestBody Patient empobj)
	{
	System.out.println("Received Data : " +empobj);
	empP.save(empobj);
	return "Record inserted successfulyy";
	}
	
	@PostMapping (path="/insertInvoice")
	public String insertInvoice(@RequestBody Invoice empobj)
	{
	System.out.println("Received Data : " +empobj);
	empI.save(empobj);
	return "Record inserted successfulyy";
	}

	@PutMapping (path="/updateEmployee")
	public String updateEmployee(@RequestBody Employee empobj)
	{
		Optional<Employee> emo=empRepository.findById(empobj.getId());
		if(emo.isPresent())
		{
			Employee eu=emo.get();
			eu.setName(empobj.getName());
			eu=emo.get();
			eu.setSpeciality(empobj.getSpeciality());
			empRepository.save(eu);
			return "Recode updated Successfully";
			
			
		}
		return "Unable to update record";
	}
	
	@PutMapping (path="/updatePatient")
	public String updatePatient(@RequestBody Patient empobj)
	{
		Optional<Patient> emo=empP.findById(empobj.getId());
		if(emo.isPresent())
		{
			Patient eu=emo.get();
			eu.setName(empobj.getName());
			eu=emo.get();
			eu.setDisease(empobj.getDisease());
			empP.save(eu);
			return "Recode updated Successfully";
			
			
		}
		return "Unable to update record";
	}
	
	@PutMapping (path="/updateInvoice")
	public String updateInvoice(@RequestBody Invoice empobj)
	{
		Optional<Invoice> emo=empI.findById(empobj.getId());
		if(emo.isPresent())
		{
			Invoice eu=emo.get();
			eu=emo.get();
			eu.setAmount(empobj.getAmount());
			empI.save(eu);
			return "Record updated Successfully";
			
			
		}
		return "Unable to update record";
	}

	@DeleteMapping (path="/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		System.out.println("Given id is : " +id);
		empRepository.deleteById(id);
		return "Record deleted Successfully";
		
	}
	
	@DeleteMapping (path="/deletePatient/{id}")
	public String deletePatient(@PathVariable int id)
	{
		System.out.println("Given id is : " +id);
		empP.deleteById(id);
		return "Record deleted Successfully";
		
	}
	
	@DeleteMapping (path="/deleteInvoice/{id}")
	public String deleteInvoice(@PathVariable int id)
	{
		System.out.println("Given id is : " +id);
		empI.deleteById(id);
		return "Record deleted Successfully";
		
	}
}