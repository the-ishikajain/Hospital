package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="invoices")
public class Invoice {
	@Id
	int id;
	@Column(name="patient_id")
	int patient_id;
	@Column(name="amt")
	int amt;

	Invoice(){}

	public Invoice(int id,int patient_id,int amt)
	{
	super();
	this.id=id;
	this.patient_id=patient_id;
	this.amt=amt;
	}
	public int getId()
	{
	return id;
	}
	public void setId(int id)
	{
	this.id=id;
	}
	public int getPatientId()
	{
	return patient_id;
	}
	public void setPatientId(int patient_id)
	{
	this.patient_id=patient_id;
	}
	public int getAmount()
	{
	return amt;
	}
	public void setAmount(int amt)
	{
	this.amt=amt;
	}
	@Override
	public String toString()
	{
	return "Invoice id = " +id + " Patient id = " +patient_id + "Amount =" +amt;
	}
}