package com.demo.JpaCascadeRemove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.JpaCascadeRemove.entity.StudentEntity;

public class JpaCascadeRemove 
{
    public static void main( String[] args )
    {
    	
    	          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "JpaCascadeRemove" );  
    	            
    	          EntityManager em = emf.createEntityManager( );  
    	          em.getTransaction().begin();  
    	  
    	           
    	          StudentEntity s=em.find(StudentEntity.class, 101);  
    	          em.remove(s);  // got deleted from studententity(parent entity) and hence got deleted from subject(child entity) too
    	            
    	          
    	          em.getTransaction().commit();  
    	  
    	          em.close( );  
    	          emf.close( );  
    	          
    	          
    	    }	
    }

