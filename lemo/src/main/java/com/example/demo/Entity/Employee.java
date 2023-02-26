package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="doctor")
public class Employee {
	@Id
	int id;
	@Column(name="name")
	String name;
	@Column(name="age")
	int age;
	@Column(name="speciality")
	String speciality;

	Employee(){}

	public Employee(int id,String name,int age,String speciality)
	{
	super();
	this.id=id;
	this.name=name;
	this.age=age;
	this.speciality=speciality;
	}
	public int getId()
	{
	return id;
	}
	public void setId(int id)
	{
	this.id=id;
	}
	public String getName()
	{
	return name;
	}
	public void setName(String name)
	{
	this.name=name;
	}
	public int getAge()
	{
	return age;
	}
	public void setAge(int age)
	{
	this.age=age;
	}

	public String getSpeciality()
	{
	return speciality;
	}
	public void setSpeciality(String speciality)
	{
		this.speciality=speciality;
	}
	@Override
	public String toString()
	{
	return "Doctor id = " +id + " name = " +name + "Age =" +age+ "Speacility =" +speciality;
	}
}