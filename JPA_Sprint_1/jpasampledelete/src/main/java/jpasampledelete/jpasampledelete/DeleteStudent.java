package jpasampledelete.jpasampledelete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpasampledelete.jpasampledelete.entity.StudentEntity;

public class DeleteStudent {  	  
	    public static void main(String args[])  
	    {  
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
	    EntityManager em=emf.createEntityManager();  
	    em.getTransaction().begin(); 						// begin transaction 
	  
	    StudentEntity s=em.find(StudentEntity.class,102);	// getting the id
	    
	    em.remove(s);  										// removing the id
	    
	    em.getTransaction().commit();  						// saving the transaction
	    
	    emf.close();  										
	    em.close();											// closing the entitymanager stuff  	 
	    }  
	}