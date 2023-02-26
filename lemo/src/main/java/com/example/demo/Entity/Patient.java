package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="patients")
public class Patient {
	@Id
	int id;
	@Column(name="name")
	String name;
	@Column(name="age")
	int age;
	@Column(name="disease")
	String disease;

	Patient(){}

	public Patient(int id,String name,int age,String disease)
	{
	super();
	this.id=id;
	this.name=name;
	this.age=age;
	this.disease=disease;
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

	public String getDisease()
	{
	return disease;
	}
	public void setDisease(String disease)
	{
		this.disease=disease;
	}
	@Override
	public String toString()
	{
	return "Patient id = " +id + " name = " +name + "Age =" +age+ "Disease =" +disease;
	}
}