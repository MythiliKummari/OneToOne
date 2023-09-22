package com.mythili.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PassPort")
public class PassPort {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="PassPort_id")
     private int id;
	 @Column(name="DOB")
     private String dob;
     @OneToOne
	@JoinColumn(name="person_id")
	private Person person;

	public int getId()
	{
		return id;
	}
    public void setId(int id) 
    {
		this.id = id;
	}
    public String getDOB() 
    {
		return dob;
	}
    public void setDOB(String dob) 
    {
		this.dob = dob;
	}
    public Person getPerson()
    {
		return person;
	}
    public void setPerson(Person person)
    {
		this.person = person;
	}
    public PassPort(int id, String dob, Person person) 
    {
		super();
		this.id = id;
		this.dob = dob;
		this.person = person;
	}
    public PassPort() 
    {
		super();
		// TODO Auto-generated constructor stub
	}
	
}


