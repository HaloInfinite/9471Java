package firstspring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {
	public static void main(String[] args) { 
		
		  /* Resource resource=new ClassPathResource("applicationContext.xml");  
		    @SuppressWarnings("deprecation")
			BeanFactory factory=new XmlBeanFactory(resource);
		    
		    Student student=(Student)factory.getBean("studentbean");  
		    student.displayInfo();*/


		   /* int a = 25, b =  78, c =  87;
		    int max = (a > b) && (a > c) ? a : (b > c) ? b : c;
		    System.out.println(max);*/
			      
	    
	   ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		      
    Student student=(Student)ac.getBean("studentbean");  
		    student.displayInfo(); 
		    ((ClassPathXmlApplicationContext) ac).close();  
		}  
		}

