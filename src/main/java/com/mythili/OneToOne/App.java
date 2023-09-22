package com.mythili.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mythili.model.PassPort;
import com.mythili.model.Person;
/**
 * Hello world!
 *
 */
public class App 
{
public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try 
		{
			 Person person=new Person();
			  person.setPerson_name("Mythili");
			  
			  PassPort address=new PassPort();
			  address.setDOB("14-8-2002");
			  
			  person.setPassPort(address);
			  address.setPerson(person);
			  
			  session.save(person);
			  session.getTransaction().commit();
			
			  Person retrievedPerson=session.get(Person.class,person.getId());
			  PassPort retrievedPassPort=retrievedPerson.getPassport();
			  
			  System.out.println("Person: "+retrievedPerson.getPerson_name());
			  System.out.println("PassPort: "+retrievedPassPort.getDOB());
			}
			finally 
			{
				session.close();
	            sessionFactory.close();
			}
          }
        }

