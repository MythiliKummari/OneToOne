package com.mythili.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="person_id")
	private int id;
	@Column(name="person_name")
	private String person_name;
	
	@OneToOne(mappedBy="person",cascade=CascadeType.ALL)
	private PassPort passport;

	public Person(int id, String person_name, PassPort passport) 
	{
		super();
		this.id = id;
		this.person_name = person_name;
		this.passport = passport;
	}

	public int  getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getPerson_name() 
	{
		return person_name;
	}

	public void setPerson_name(String person_name)
	{
		this.person_name = person_name;
	}
	public PassPort getPassport()
	{
		return passport;
	}

	public void setPassPort(PassPort passport) 
	{
		this.passport = passport;
	}

	public Person()
	{
		super();
		// TODO Auto-generated constructor stub
	}
}





