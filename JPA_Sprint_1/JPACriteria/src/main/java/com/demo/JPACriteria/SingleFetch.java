package com.demo.JPACriteria;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.demo.JPACriteria.entity.StudentEntity;

public class SingleFetch {  
    
    
    public static void main( String args[]) {  
             
    	//SingleFetch.selectSingleRecord();
    	//SingleFetch.selectMultiRecords();
    	//SingleFetch.selectASCOrderByRecords();
    	//SingleFetch.selectDSCOrderByRecords();
    }
           
    
		private static void selectSingleRecord() {
    		  EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
              EntityManager em = emf.createEntityManager();  
              em.getTransaction().begin( );

              
              CriteriaBuilder cb=em.getCriteriaBuilder();  
              CriteriaQuery<StudentEntity> cq=cb.createQuery(StudentEntity.class);  
                
              Root<StudentEntity> stud=cq.from(StudentEntity.class);  
               
              //cq.multiselect(stud.get("s_name")); 
              cq.select(stud);
              CriteriaQuery<StudentEntity> select = cq.select(stud);  
              TypedQuery<StudentEntity> q = em.createQuery(select);  
              List<StudentEntity> list = q.getResultList(); 
           
      
              System.out.println("s_id");  
                   
                
              for(StudentEntity s:list)  
              {  
              System.out.println(s.getS_id() + " " + s.getS_name() + " " + s.getS_age());  
          
              }  
                
              em.getTransaction().commit();  
              em.close();  
              emf.close(); 
 }
    	 
		
		
		private static void selectMultiRecords() {
  		  EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
            EntityManager em = emf.createEntityManager();  
            em.getTransaction().begin( );

            
            CriteriaBuilder cb=em.getCriteriaBuilder();  
            CriteriaQuery<StudentEntity> cq=cb.createQuery(StudentEntity.class);  
              
            Root<StudentEntity> stud=cq.from(StudentEntity.class);  
             
            cq.multiselect(stud.get("s_id"), stud.get("s_name"));	//, stud.get("s_age")); 
           
            CriteriaQuery<StudentEntity> select = cq.select(stud);  
            TypedQuery<StudentEntity> q = em.createQuery(select);  
            List<StudentEntity> list = q.getResultList(); 
         
    
            System.out.println("s_id" + "   " + "s_name" + "\t" + "s_age");  
                 
              
            for(StudentEntity s:list)  
            {  
            System.out.println(s.getS_id() + "      " + s.getS_name() + "\t" + s.getS_age());  
        
            }  
              
            em.getTransaction().commit();  
            em.close();  
            emf.close();  
  	  }
		
		private static void selectASCOrderByRecords() {
			
	         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
	         EntityManager em = emf.createEntityManager();  
	          			   em.getTransaction().begin( );  
	          				
		     CriteriaBuilder cb=em.getCriteriaBuilder();  
	         CriteriaQuery<StudentEntity> cq=cb.createQuery(StudentEntity.class);  
	         Root<StudentEntity> stud =	cq.from(StudentEntity.class);  
	           
		     cq.orderBy(cb.asc(stud.get("s_age")));  
		     
		     CriteriaQuery<StudentEntity> select = cq.select(stud);  
		     TypedQuery<StudentEntity> q = em.createQuery(select);  
	         List<StudentEntity> list = q.getResultList();  
		  
	         System.out.println("s_id" + "   " + "s_name" + "\t" + "s_age");  
             
             
	            for(StudentEntity s:list)  
	            {  
	            System.out.println(s.getS_id() + "      " + s.getS_name() + "\t" + s.getS_age());  
	        
	            }  
	              
	            em.getTransaction().commit();  
	            em.close();  
	            emf.close();     
		     }  
		
		private static void selectDSCOrderByRecords() {
			
	         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
	         EntityManager em = emf.createEntityManager();  
	          			   em.getTransaction().begin( );  
	          				
		     CriteriaBuilder cb=em.getCriteriaBuilder();  
	         CriteriaQuery<StudentEntity> cq=cb.createQuery(StudentEntity.class);  
	         Root<StudentEntity> stud =	cq.from(StudentEntity.class);  
	           
		     cq.orderBy(cb.desc(stud.get("s_age")));  
		     
		     CriteriaQuery<StudentEntity> select = cq.select(stud);  
		     TypedQuery<StudentEntity> q = em.createQuery(select);  
	         List<StudentEntity> list = q.getResultList();  
		  
	         System.out.println("s_id" + "   " + "s_name" + "\t" + "s_age");  
             
             
	            for(StudentEntity s:list)  
	            {  
	            System.out.println(s.getS_id() + "      " + s.getS_name() + "\t" + s.getS_age());  
	        
	            }  
	              
	            em.getTransaction().commit();  
	            em.close();  
	            emf.close(); 
		     }  
}

		  
